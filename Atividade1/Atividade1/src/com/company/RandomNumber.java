package com.company;

import java.util.Random;

public class RandomNumber{

    //Gera e retorna um número aleatório na faixa desejada
    public static int getRandomNumberInRange(int min, int max){
        Random random = new Random();
        return random.nextInt((max-min) + 1) + min;
    }
}
