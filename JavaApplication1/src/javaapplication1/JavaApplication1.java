package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
  
    public static void main(String[] args) {
    Scanner grava = new Scanner (System.in);
    int op;
    
    do{
    System.out.println("1 - Conversão de Fahrenheit para centígrados\n"
            + "2 - Nome, idade e sexo de 20 pessoas\n"
            + "3 - Quantidade do sexo masculino\n"
            + "4 - Tempo que um país ira ultrapassar o outro em quantidade de habitantes \n"
            + "5 - Tempo que uma criança ficara maior que a outra\n"
            + "6 - Tabela de conversão de polegadas para centimentros\n"
            + "7 - Sair\n"
            + "Escolha uma opção:");
    op=grava.nextInt();
    
    if(op ==1){
        System.out.println ("Opção 1");
        }
    else if(op ==2){
        System.out.println("Opção 2");
        }
    else if(op ==3){
        System.out.println("Opção 3");
        }
    else if(op ==4){
        System.out.println("Opção 4");
        }
    else if(op ==5){
        System.out.println("Opção 5");
        }
    else if(op ==6){
        System.out.println("Opção 6");
        }
    else if(op ==7){
        System.out.println("Finalizado");
    }
    else{
        System.out.println("Opção inválida");
        }
    switch(op){
            case 1:double grau=10, fahr=50;

        do{
        System.out.println (fahr + " Graus fahrenheit é igual a "+ grau +" Graus centígrados\n");
                grau++;
                fahr=fahr+1.80;
        }
        while (fahr <151);
    }
    }
    while (op!=7);   
    }
    
}