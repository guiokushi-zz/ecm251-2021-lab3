package com.company;

import java.util.Scanner;

public class MontagemTransacao {
    private Scanner scanner = new Scanner(System.in);
    public String montarTransacao(String trans){
        System.out.println("Quanto deseja receber?");
        String scan = scanner.nextLine();
        String transFormat = trans + ";" + scan + ";" + RandomNumber.getRandomNumberInRange(1000,9999);
        return transFormat;
    }
}
