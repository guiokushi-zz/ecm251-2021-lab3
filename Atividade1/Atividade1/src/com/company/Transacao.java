package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Transacao {
//    private Scanner scanner = new Scanner(System.in);
    private TranDb tranDb = new TranDb();
    private MontagemTransacao montagemTransacao = new MontagemTransacao();
    private ArmazenarTransacao armazenarTransacao = new ArmazenarTransacao();
    public void recdb(ArrayList db) {
        tranDb.receberDb(db);
    }

    public void recebcred(int id, String nome){
        armazenarTransacao.recebTran(montagemTransacao.montarTransacao(SeparadorDeString.separaString(tranDb.teste(id))),id);
    }

}
