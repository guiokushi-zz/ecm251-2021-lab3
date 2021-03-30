package com.company;

import java.util.Scanner;

public class Conta {
    private double saldo;
    private Scanner scanner = new Scanner(System.in);
    private int op;
    private Usuarios usuarios = new Usuarios();

    public Conta() {

    }

    public void menuConta(){
        System.out.println("Consulte ou cadastre o usuário [1]Login [2]Cadastro");
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
    private void cadastroConta(){
        System.out.println("Saldo inicial: ");
        saldo = scanner.nextDouble();
        usuarios.cadastroUsuário(this.saldo);
        finalizarCadastro();
    }

    private void finalizarCadastro() {
        System.out.println("Deseja cadastrar mais algum usuario? [y]Sim [n]Não");
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
