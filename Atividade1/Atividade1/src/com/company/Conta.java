package com.company;

import java.util.Scanner;

public class Conta {
    private int idConta;
    private int saldo;
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
                usuarios.cadastroUsuário();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
    public void cadastroConta(String conta){
        int quant;

        System.out.printf("Quantas contas deseja cadastrar");
        quant = scanner.nextInt();
        for (int i = 0; i < quant; i++){
            System.out.printf("insira as informações da conta nesse padrão ()");
        }

    }
}
