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
                transacao.recdb(conta.devolvedb());
                break;
            case 3:
                System.out.println("Id de quem ira pagar: ");
                int idsend = scanner.nextInt();
                String qrcode = MontagemTransacao.pegarQRCode();
                transacao.pagarTransferencia(idsend,qrcode,SeparadorDeString.retornaId(qrcode));
                break;
            case 4:
                System.out.println("Informe seu ID: ");
                int id = scanner.nextInt();
                String nome = scanner.nextLine();
                transacao.recebcred(id,nome);
                break;
            default:
                System.out.printf("Opção inválida, tente novamente\n");
        }
    }

    //Menu para o usuario
    private void menu(){
        System.out.printf("Bem-vindo a QRBank\n");
        System.out.println("-----Selecione uma das operações abaixo-----");
        System.out.println("1 - Consultar usuário");
        System.out.println("2 - Cadastrar usuário");
        System.out.printf("3 - Realizar pagamento\n");
        System.out.printf("4 - Receber créditos\n");
        System.out.println("0 - Sair do sistema");
    }
}