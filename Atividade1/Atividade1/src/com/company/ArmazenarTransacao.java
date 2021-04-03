package com.company;

import java.util.ArrayList;

public class ArmazenarTransacao {
    private ArrayList<String> armazenaTran = new ArrayList<String>();

    //Preenche o index 0
    public ArmazenarTransacao() {
        armazenaTran.add("------");
    }

    //Recebe a transação que foi gerada e armazena no banco de dados de transações
    public void recebTran(String transacao, int id){
        armazenaTran.add(transacao);
        mostrarTran(id);
    }

    //Exibe o QRCode que foi gerado
    private void mostrarTran(int id){
        System.out.println("Apenas um QRCode será criado por transação");
        System.out.println("QRCode:");
        System.out.println(armazenaTran.get(armazenaTran.size()-1));
    }

    //Retorna se o QRCode é válido
    public boolean retornaValidadeTransacao(String qrcode,String qRCodeId){
        int qRcodeIdconv = Integer.parseInt(qRCodeId);
        if (armazenaTran.get(armazenaTran.size()-1).equals(qrcode)){
            return true;
        }else {
            return false;
        }
    }

    //Remove a transação que foi efetuada do banco de dados de transações
    public void removeTran(){
        armazenaTran.remove(1);
    }
}
