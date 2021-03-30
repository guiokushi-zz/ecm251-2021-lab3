package com.company;

import java.util.Scanner;

public class Conta {
    private double saldo;
    private Scanner scanner = new Scanner(System.in);
    private int op;
    private Usuarios usuarios = new Usuarios();

    public Conta() {

    }

    public void cadastroConta(){
        System.out.println("Qual será o saldo inicial da conta: ");
        saldo = scanner.nextDouble();
        usuarios.cadastroUsuário(this.saldo);
        finalizarCadastro();
    }

    private void finalizarCadastro() {
        System.out.println("Deseja cadastrar mais algum usuário? [y]Sim [n]Não");
        String sw = scanner.next();
        switch (sw){
            case "y":
                cadastroConta();
                break;
            case "n":
                for (String dados: usuarios.db){
                    System.out.println(dados);
                }
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
