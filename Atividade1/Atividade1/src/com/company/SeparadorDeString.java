package com.company;

import java.util.Scanner;

public class SeparadorDeString {

    //Separa a String recebida e retorna o ID e o nome do cliente
    public static String separaString(String contaPreFormat){
        String [] conta =  contaPreFormat.split(";");
        String contaPosFormat = conta[0] + ";" + conta[1];
        return contaPosFormat;
    }

    //Separa a String e retorna o ID do QRCode
    public static String retornaId(String qrcode){
        String [] conta = qrcode.split(";");
        return conta[0];
    }

    //Separa a String e retorna o valor do QRCode
    public static double retornaValor(String qrcode){
        String [] conta = qrcode.split(";");
        double valor = Double.parseDouble(conta[2]);
        return valor;
    }

    //Separa a String e retorna o saldo da conta do cliente
    public static double retornaSaldo(String conta){
        String [] dados = conta.split(";");
        double valor = Double.parseDouble(dados[4]);
        return valor;
    }
}
