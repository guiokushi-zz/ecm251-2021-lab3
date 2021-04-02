package com.company;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.Random;
import java.util.Scanner;

public class Transacao {
//    private Scanner scanner = new Scanner(System.in);
    private TranDb tranDb = new TranDb();
    private ArmazenarTransacao armazenarTransacao = new ArmazenarTransacao();
    private Scanner scanner = new Scanner(System.in);
    private OperacaoTransacao operacaoTransacao = new OperacaoTransacao();

    public void recdb(ArrayList db) {
        tranDb.receberDb(db);
    }

    public void recebcred(int id, String nome){
        armazenarTransacao.recebTran(MontagemTransacao.montarTransacao(SeparadorDeString.separaString(tranDb.teste(id))),id);
    }

    public void pagarTransferencia(int idsend,String qrcode,String qrcodeId){
        if (tranDb.retornaValidadeId(Integer.toString(idsend))) {
            System.out.println("Sua conta foi verificada com sucesso!");
            if (tranDb.retornaValidadeId(qrcodeId)) {
                System.out.println("Conta do recebedor foi verificada com sucesso!");
                if (armazenarTransacao.retornaValidadeTransacao(qrcode, qrcodeId)) {
                    System.out.println("QRCode validado com sucesso!");
                    if (tranDb.retornaSaldoSuficiente(idsend,SeparadorDeString.retornaValor(qrcode))){

                        operacaoTransacao.operacao(SeparadorDeString.retornaValor(qrcode),SeparadorDeString.retornaSaldo(tranDb.teste(idsend)),SeparadorDeString.retornaSaldo(tranDb.teste(Integer.parseInt(qrcodeId))));
                        operacaoTransacao.salvarConta(tranDb.teste(Integer.parseInt(qrcodeId)),tranDb.teste(idsend));
                        tranDb.atualizarDb(Integer.parseInt(qrcodeId),idsend, operacaoTransacao.devolveConta1(), operacaoTransacao.devolveConta2());
                        armazenarTransacao.removeTran();

                    }else {
                        System.out.println("Seu saldo não foi suficiente para completar a transação");
                    }
                }else {
                    System.out.println("QRCode não pode ser validado");
                }
            }else {
                System.out.println("Não foi possivel verificar a conta do recebedor");
            }
        }else {
            System.out.println("Sua Id é inválido");
        }
    }
}
