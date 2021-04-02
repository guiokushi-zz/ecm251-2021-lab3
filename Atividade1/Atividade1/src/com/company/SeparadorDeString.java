package com.company;

import java.util.Scanner;

public class SeparadorDeString {
    public static String separaString(String contaPreFormat){
        String [] conta =  contaPreFormat.split(";");
        String contaPosFormat = conta[0] + ";" + conta[1];
        return contaPosFormat;
    }
    public static String retornaId(String qrcode){
        String [] conta = qrcode.split(";");
        return conta[0];
    }
    public static double retornaValor(String qrcode){
        String [] conta = qrcode.split(";");
        double valor = Double.parseDouble(conta[2]);
        return valor;
    }
    public static double retornaSaldo(String conta){
        String [] dados = conta.split(";");
        double valor = Double.parseDouble(dados[4]);
        return valor;
    }
}
