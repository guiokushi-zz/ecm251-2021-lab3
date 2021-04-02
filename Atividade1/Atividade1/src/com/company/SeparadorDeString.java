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
}
