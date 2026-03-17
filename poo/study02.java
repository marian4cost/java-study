package poo;

import java.util.Scanner;

class Numbers{
    int number;
    String tipo;

    public Numbers(int number, String tipo){
        this.tipo = tipo;

        if(number%2 == 0){
            this.number = number;
        }
        else {
            System.out.println("não aceito (ímpar)");
        }
    }

    public void printar() {
        System.out.println("Nada");
    }
}

public class study02 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número par: ");
        int number = scanner.nextInt();

        Numbers numbers = new Numbers(number, "oi");
    }
}
