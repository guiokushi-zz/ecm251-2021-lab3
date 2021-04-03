package com.company;

import java.util.Scanner;

public class MontagemTransacao {

    //Monta o QRCode em formato de String
    public static String montarTransacao(String trans){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto deseja receber?");
        String scan = scanner.nextLine();
        String transFormat = trans + ";" + scan + ";" + RandomNumber.getRandomNumberInRange(1000,9999);
        return transFormat;
    }

    //Recebe o QRCode a ser utilizado
    public static String pegarQRCode(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o QRCode: ");
        String qrcode = scanner.nextLine();
        return qrcode;
    }
}
