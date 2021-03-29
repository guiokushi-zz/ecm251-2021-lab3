package com.company;

import java.util.Scanner;

public class Sistema {
    private boolean manterExecucao;
    private boolean cadastroCompleto;
    private int opcao;
    private Scanner scanner = new Scanner(System.in);
    private Conta conta = new Conta();


    //Parametros iniciais
    public Sistema() {
        this.manterExecucao = true;
        this.cadastroCompleto = false;
    }

    //Funçao principal
    public void executar(){
        System.out.printf("Bem-vindo a QRBank\n");
        while (manterExecucao){
            menu();
        }
    }

    //Menu para o usuario
    private void menu(){
        //Cadastro de usuario
        

        System.out.printf("1 - Realizar pagamento\n");
        System.out.printf("2 - Receber créditos\n");
        opcao = scanner.nextInt();
        //Avalia a escolha do usuário
        switch (opcao){
            case 1:
                //System.out.printf("hello1");
                break;
            case 2:
                //System.out.printf("hello2");
                break;
            default:
                System.out.printf("Opção inválida, tente novamente\n");
        }
    }
}
