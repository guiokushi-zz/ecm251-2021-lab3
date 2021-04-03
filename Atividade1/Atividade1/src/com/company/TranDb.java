package com.company;

import java.util.ArrayList;

public class TranDb {
    private ArrayList<String> trandb = new ArrayList<String>();

    //Recebe os dados do banco de dados principal
    public void receberDb(ArrayList db){
        trandb = db;
    }

    //Retorna informações de um usuario especifico
    public String teste(int id){
        return trandb.get(id-1);
    }

    //Valida se o id informado existe ou não
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

    //Valida se a conta que ira enviar o dinheiro tem saldo o suficiente na conta
    public boolean retornaSaldoSuficiente(int idsend,double valor){
        double valorSend = SeparadorDeString.retornaSaldo(trandb.get(idsend-1));
        if (valor <= valorSend){
            return true;
        }else {
            return false;
        }
    }

    //Atualiza as informações do tranDb com os dados pós-transferência
    public void atualizarDb(int recId, int sendId,String recConta, String sendConta){
        trandb.set(recId-1,recConta);
        trandb.set(sendId-1,sendConta);
    }

    //Retorna o tranDb
    public ArrayList devolveTranDb(){
        return trandb;
    }
}
