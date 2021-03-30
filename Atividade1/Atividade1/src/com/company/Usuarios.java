package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuarios {
    private String nome;
    private String senha;
    private String email;
    private Scanner scanner = new Scanner(System.in);
    public ArrayList<String> db = new ArrayList<String>();
    private int conv;
    private String idConta;

    public void cadastroUsuário(double saldo){
        System.out.println("Nome do usuário: ");
        this.nome = scanner.next();
        System.out.println("senha: ");
        this.senha = scanner.next();
        System.out.println("email: ");
        this.email = scanner.next();
        armazenarDados(saldo,this.nome,this.senha,this.email);
    }

    private void armazenarDados(double saldo, String nome, String senha, String email) {
        this.conv = db.size() + 1;
        this.idConta = Integer.toString(conv);
        db.add(this.idConta + ";" + nome + ";" + senha + ";" + email + ";" + saldo);
    }

//    public static String consultarDados(){
//        return;
//    }

}
