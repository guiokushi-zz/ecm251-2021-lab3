package com.company;

import java.util.Scanner;

public class Sistema {
    private boolean manterExecucao;
    private int opcao;
    private Scanner scanner = new Scanner(System.in);
    private Conta conta = new Conta();
    private Transacao transacao = new Transacao();

    //Parametros iniciais
    public Sistema() {
        this.manterExecucao = true;
    }

    //Funçao principal
    public void executar(){
        while (manterExecucao){
            menu();
            this.opcao = scanner.nextInt();
            avaliarOpcao(this.opcao);
        }
    }

    //Verifica a opção escolhida pelo usuário
    private void avaliarOpcao(int opcao){
        //Avalia a escolha do usuário
        switch (opcao){
            case 0:
                manterExecucao = false;
                break;
            case 1:
                conta.consultarConta();
                break;
            case 2:
                conta.cadastroConta();
                break;
            case 3:
                break;
            case 4:
                transacao.recebeCredito();
                break;
            default:
                System.out.printf("Opção inválida, tente novamente\n");
        }
    }

    //Menu para o usuario
    private void menu(){
        System.out.println("Bem-vindo a QRBank");
        System.out.println("-----Selecione uma das operações abaixo-----");
        System.out.println("1 - Consultar usuário");
        System.out.println("2 - Cadastrar usuário");
        System.out.println("3 - Realizar pagamento");
        System.out.println("4 - Receber pagamento");
        System.out.println("0 - Sair do sistema");
    }
}
