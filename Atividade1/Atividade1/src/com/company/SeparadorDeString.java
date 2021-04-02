package com.company;

public class SeparadorDeString {
    public static String separaString(String contaPreFormat){
        String [] conta =  contaPreFormat.split(";");
        String contaPosFormat = conta[0] + ";" + conta[1];
        return contaPosFormat;
    }
}
