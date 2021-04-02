package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Transacao {
//    private Scanner scanner = new Scanner(System.in);
    private TranDb tranDb = new TranDb();
    private ArmazenarTransacao armazenarTransacao = new ArmazenarTransacao();
    private Scanner scanner = new Scanner(System.in);

    public void recdb(ArrayList db) {
        tranDb.receberDb(db);
    }

    public void recebcred(int id, String nome){
        armazenarTransacao.recebTran(MontagemTransacao.montarTransacao(SeparadorDeString.separaString(tranDb.teste(id))),id);
    }

    public void pagarTransferencia(int idsend,String qrcode,String qrcodeId){
        if (tranDb.retornaValidadeId(Integer.toString(idsend))) {
            if (tranDb.retornaValidadeId(qrcodeId)) {
                if (armazenarTransacao.retornaValidadeTransacao(qrcode, qrcodeId)) {
                    System.out.println("HEEEEEy");
                }
            }
        }else {
            System.out.println("Sua Id é inválido");
        }
    }
}
