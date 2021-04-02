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


    public boolean retornaValidadeTransacao(String qrcode,String qRCodeId){
        int qRcodeIdconv = Integer.parseInt(qRCodeId);
        if (armazenaTran.get(qRcodeIdconv-1).equals(qrcode)){
            System.out.println("QRCode validado com sucesso!");
            return true;
        }else {
            System.out.println("QRCode não pode ser validado");
            return false;
        }
    }
}
