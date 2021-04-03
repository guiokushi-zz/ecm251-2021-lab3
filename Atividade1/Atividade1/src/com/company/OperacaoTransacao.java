package com.company;

import java.util.ArrayList;

public class OperacaoTransacao {
    private ArrayList<String> contasPosTransf = new ArrayList<String>();
    private double sendSaldo;
    private double recSaldo;

    //Operação de transferencia do valor do QRCode
    public void operacao(double qrValor,double sendSaldo,double recSaldo){
        this.sendSaldo = sendSaldo - qrValor;
        this.recSaldo = recSaldo + qrValor;
    }

    //Salva as novas informaçõesdo cliente pós-transferência no banco de dados
    public void salvarConta(String recConta,String sendConta){
        String [] conta1 = recConta.split(";");
        String [] conta2 = sendConta.split(";");
        conta1[4] = Double.toString(this.recSaldo);
        conta2[4] = Double.toString(this.sendSaldo);
        contasPosTransf.add(conta1[0] + ";" + conta1[1] + ";" + conta1[2] + ";" + conta1[3] + ";" + conta1[4]);
        contasPosTransf.add(conta2[0] + ";" + conta2[1] + ";" + conta2[2] + ";" + conta2[3] + ";" + conta2[4]);

    }

    //Retorna a conta atualizada de quem recebeu o dinheiro
    public String devolveConta1(){
        return contasPosTransf.get(0);
    }

    //Retorna a conta atualizada de quem enviou o dinheiro
    public String devolveConta2(){
        return contasPosTransf.get(1);
    }

    //Limpa o banco de dados das transferências
    public void limpardb(){
        contasPosTransf.clear();
    }
}
