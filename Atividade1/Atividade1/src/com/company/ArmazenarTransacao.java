package com.company;

import java.util.ArrayList;

public class ArmazenarTransacao {
    private ArrayList<String> armazenaTran = new ArrayList<String>();

    public ArmazenarTransacao() {
        armazenaTran.add("------");
    }

    public void recebTran(String transacao, int id){
        armazenaTran.add(transacao);
        mostrarTran(id);
    }

    private void mostrarTran(int id){
        System.out.println("Apenas um QRCode será criado por transação");
        System.out.println("QRCode:");
//        for (String dados: armazenaTran){
//            System.out.println(dados);
//        }
        System.out.println(armazenaTran.get(armazenaTran.size()-1));
    }

    public boolean retornaValidadeTransacao(String qrcode,String qRCodeId){
        int qRcodeIdconv = Integer.parseInt(qRCodeId);
        if (armazenaTran.get(armazenaTran.size()-1).equals(qrcode)){
            return true;
        }else {
            return false;
        }
    }
    public void removeTran(){
        armazenaTran.remove(1);
        for (String dados: armazenaTran){
            System.out.println(dados);
        }
    }
}
