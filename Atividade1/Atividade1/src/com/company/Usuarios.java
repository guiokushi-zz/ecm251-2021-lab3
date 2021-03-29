package com.company;

import java.util.Scanner;

public class Usuarios {
    private String nome;
    private String senha;
    private String email;
    private Scanner scanner = new Scanner(System.in);

    public void cadastroUsuário(){
        System.out.println("Nome do usuário: ");
        this.nome = scanner.next();
        System.out.println("Nome do senha: ");
        this.senha = scanner.next();
        System.out.println("Nome do email: ");
        this.email = scanner.next();
    }
}
