package com.company;

import java.util.Scanner;

public class Conta {
    private double saldo;
    private Scanner scanner = new Scanner(System.in);
    private int op;
    private Usuarios usuarios = new Usuarios();
    public void menuConta(){
        System.out.println("Realize o login ou cadastre o usuário [1]Login [2]Cadastro");
        op = scanner.nextInt();
        switch (op){
            case 1:
                break;
            case 2:
                cadastroConta();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
    public void cadastroConta(){
        System.out.println("Saldo inicial: ");
        saldo = scanner.nextDouble();
        usuarios.cadastroUsuário(this.saldo);

    }
}
