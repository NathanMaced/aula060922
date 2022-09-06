package main;

public class main {

    public static void main(String[] args) {
        double grau=10, fahr=50;
        
    do{
    System.out.println (fahr + " Graus fahrenheit é igual a "+ grau +" Graus centígrados\n");
            grau++;
            fahr=fahr+1.80;
    }
    while (fahr <151);
    }
    
}