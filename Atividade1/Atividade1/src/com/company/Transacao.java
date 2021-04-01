package com.company;

import java.util.Random;
import java.util.Scanner;

public class Transacao {
    private Usuarios usuarios = new Usuarios();
    private Scanner scanner = new Scanner(System.in);
//    public void recebeCredito(){
//        usuarios.transicao();
//    }
    private static int getRandomNumberInRange(int min, int max){
        Random random = new Random();
        return random.nextInt((max-min) + 1) + min;
    }
}
