package main;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner (System.in);
        int qtde,opt,cont = 0;
        
        System.out.println("1 - Maculino\n"
                + "2 - Feminino\n"
                + "3 - Sair");
        opt=grava.nextInt();
        do{
            if(opt==1){
            cont++;
            System.out.println(cont);
            }
            
        }
        while (opt!=3);
        System.out.println("Finalizado");
    }
    
}
