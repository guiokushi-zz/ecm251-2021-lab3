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

    //Questionario para pegar outras informações do cliente
    public void cadastroUsuário(double saldo){
        System.out.println("Nome do usuário: ");
        this.nome = scanner.nextLine();
        System.out.println("senha: ");
        this.senha = scanner.nextLine();
        System.out.println("email: ");
        this.email = scanner.nextLine();
        armazenarDados(saldo,this.nome,this.senha,this.email);
    }

    //Armazenar todas as informações do cliente
    private void armazenarDados(double saldo, String nome, String senha, String email) {
        this.conv = db.size() + 1;
        this.idConta = Integer.toString(conv);
        db.add(this.idConta + ";" + nome + ";" + senha + ";" + email + ";" + saldo);
        System.out.println("Seu id de conta é: " + idConta);
    }

    //Consulta dados do cliente usando o id da conta e a senha
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

    //Retorna todas as informações do banco de dados principal
    public ArrayList devolvedbu(){
        return db;
    }

    //Atualiza o banco de dados principal
    public void recebeDbAtual(ArrayList dbatu){
        db = dbatu;
    }

}