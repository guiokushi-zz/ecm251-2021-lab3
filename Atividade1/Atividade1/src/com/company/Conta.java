package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Conta {
    private double saldo;
    private Scanner scanner = new Scanner(System.in);
    private Usuarios usuarios = new Usuarios();

    //Constructor da Conta()
    public Conta() {
        this.saldo = 0;
    }

    //Armazenar o saldo da conta que será criada e mandar as informações para serem armazenadas na classe Usuarios
    public void cadastroConta(){
        System.out.println("Qual será o saldo inicial da conta: ");
        saldo = scanner.nextDouble();
        usuarios.cadastroUsuário(this.saldo);
        finalizarCadastro();
    }

    //Avalia se o usuario deseja criar mais de uma conta por vez
    private void finalizarCadastro() {
        System.out.println("Deseja cadastrar mais algum usuário? [y]Sim [n]Não");
        String sw = scanner.next();
        switch (sw){
            case "y":
                cadastroConta();
                break;
            case "n":
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    //Armazenar dados para a consulta do usuario
    public void consultarConta(){
        int consultaid;
        int consultapwd;
        System.out.println("Insira o id da conta: ");
        consultaid = scanner.nextInt();
        System.out.println("Insira a senha da conta: ");
        consultapwd = scanner.nextInt();
        usuarios.consultarDados(consultaid,consultapwd);
    }

    //Devolve informações de todos os clientes para ser utilizado nas transações
    public ArrayList devolvedb(){
        return usuarios.devolvedbu();
    }

    //Atualiza o banco de dados principal com as informações pós-transação dos clientes
    public void recebDbAtualizado(ArrayList dbAtual){
        usuarios.recebeDbAtual(dbAtual);
    }
}