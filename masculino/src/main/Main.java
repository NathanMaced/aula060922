package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner grava = new Scanner (System.in);
        int idade,sx,exit;
        String nome;
    do{System.out.println("Digite o nome:");
    nome=grava.next();
    
    System.out.println("Idade");
    idade=grava.nextInt();
    
    System.out.println("1 - Feminino ou 2 - Masculino");
    sx=grava.nextInt();
    
    
    
    if(idade>21 && sx==2){
            System.out.println("O nome é "+nome);
        }
    else{System.out.println("Essa pessoa não atende as condições");}
    System.out.println("1 - Continuar ou 2 - Sair");
    exit=grava.nextInt();
    }
    while (exit!=2);
    System.out.println("Finalizado");
    }
    
    
}
