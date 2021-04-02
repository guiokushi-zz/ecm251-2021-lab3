package com.company;

import java.util.ArrayList;

public class ArmazenarTransacao {
    private ArrayList<String> armazenaTran = new ArrayList<String>();
    private MontagemTransacao montagemTransacao = new MontagemTransacao();
    public void recebTran(String transacao, int id){
        armazenaTran.add(transacao);
        mostrarTran(id);
    }
    private void mostrarTran(int id){
        System.out.println("Apenas um QRCode será criado por transação");
        System.out.println("QRCode:");
        System.out.println(armazenaTran.get(id-1));
    }

}
