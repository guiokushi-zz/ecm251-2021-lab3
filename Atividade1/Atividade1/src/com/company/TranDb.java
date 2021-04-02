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
            System.out.println("Conta verificada com sucesso!");
            return true;
        }else {
            System.out.println("Não foi possivel verificar a conta");
            return false;
        }
    }
}
