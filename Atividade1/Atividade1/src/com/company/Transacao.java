package com.company;

import java.util.Random;
import java.util.Scanner;

public class Transacao {
    private Usuarios usuarios = new Usuarios();
    private Scanner scanner = new Scanner(System.in);
    public void recebeCredito(){
        System.out.println("Insira o id de quem irá receber o pagamneto: ");
        usuarios.receberPagamento(scanner.nextInt());

        usuarios.armazenarTransacao(scanner.nextInt(),getRandomNumberInRange(1000,9999));
    }
    private static int getRandomNumberInRange(int min, int max){
        Random random = new Random();
        return random.nextInt((max-min) + 1) + min;
    }
}
