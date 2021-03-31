package com.company;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuarios {
    private String nome;
    private String senha;
    private String email;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> db = new ArrayList<String>();
    private int conv;
    private String idConta;

    //Questionario para pegar informações do cliente
    public void cadastroUsuário(double saldo){
        System.out.println("Nome do usuário: ");
        this.nome = scanner.nextLine();
        System.out.println("senha: ");
        this.senha = scanner.nextLine();
        System.out.println("email: ");
        this.email = scanner.nextLine();
        armazenarDados(saldo,this.nome,this.senha,this.email);
    }

    //Armazenartodas as informações do cliente
    private void armazenarDados(double saldo, String nome, String senha, String email) {
        this.conv = db.size() + 1;
        this.idConta = Integer.toString(conv);
        db.add(this.idConta + ";" + nome + ";" + senha + ";" + email + ";" + saldo);
        System.out.println();
    }

    //Consulta dados do cliente usando o id da contae a senha
    public void consultarDados(int id,int pwd){
        if (id <= db.size()){
            String [] dados = db.get(id-1).split(";");
            int dbconv = Integer.parseInt(dados[0]);
            int pwdconv = Integer.parseInt(dados[2]);
            if (id == dbconv && pwd == pwdconv){
                System.out.println("Nome: " + dados[1]);
                System.out.println("Email: " + dados[3]);
                System.out.println("Saldo: R$" + dados[4]);

            }else {
                System.out.println("Usuário e/ou senha inválidos");
            }
        }else {
            System.out.println("Esse id não existe");
        }
    }

    public void armazenarTransacao(int id,int idtran){
        String [] dados = db.get(id-1).split(";");
        int dbconv = Integer.parseInt(dados[0]);
        String idtranconv = Integer.toString(idtran);
        if (id == dbconv){
            System.out.println("QRCode gerado com sucesso");
            System.out.println("Seu número de transação é: " + idtran);
            String newinfo = db.get(id-1) + ";" + idtranconv;
            System.out.println(newinfo);
        }else {
            System.out.println("Usuário inválidos");
        }
        System.out.println(id);
        System.out.println(idtran);
    }
    public void receberPagamento (int id){

    }
    private boolean checarValidade(int id){
        if (id <= db.size()){
            return true;
        }else{
            return false;
        }
    }

}
