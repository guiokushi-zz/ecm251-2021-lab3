package com.company;

import java.util.ArrayList;

public class TranDb {
    private ArrayList<String> trandb = new ArrayList<String>();

    public void receberDb(ArrayList db){
        trandb = db;
    }

    public String teste(int id){
        return trandb.get(id-1);
    }

    public boolean retornaValidadeId(String id){
        int idconv = Integer.parseInt(id);
        String [] contaid = trandb.get(idconv-1).split(";");
        int contaIdConv = Integer.parseInt(contaid[0]);
        if (idconv == contaIdConv){
            return true;
        }else {
            return false;
        }
    }

    public boolean retornaSaldoSuficiente(int idsend,double valor){
        double valorSend = SeparadorDeString.retornaSaldo(trandb.get(idsend-1));
        if (valor <= valorSend){
            return true;
        }else {
            return false;
        }
    }

    public void atualizarDb(int recId, int sendId,String recConta, String sendConta){
        System.out.println("---------TranDb------------");
        System.out.println(recId + "  " + sendId);
        System.out.println(recConta + "   " + sendConta);
        trandb.add(recId-1,recConta);
        trandb.add(sendId-1,sendConta);
        for (String dados: trandb){
            System.out.println(dados);
        }
    }
}
