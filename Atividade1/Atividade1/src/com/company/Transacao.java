package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Transacao {
//    private Scanner scanner = new Scanner(System.in);
    private TranDb tranDb = new TranDb();
    private MontagemTransacao montagemTransacao = new MontagemTransacao();
    private ArmazenarTransacao armazenarTransacao = new ArmazenarTransacao();
    private Scanner scanner = new Scanner(System.in);

    public void recdb(ArrayList db) {
        tranDb.receberDb(db);
    }

    public void recebcred(int id, String nome){
        armazenarTransacao.recebTran(montagemTransacao.montarTransacao(SeparadorDeString.separaString(tranDb.teste(id))),id);
    }

    public void pagarTransferencia(int idsend){
        System.out.println("Insira o QRCode: ");
        String qrcode = scanner.nextLine();
        System.out.println(qrcode);
        System.out.println(SeparadorDeString.retornaId(qrcode));
    }
}
