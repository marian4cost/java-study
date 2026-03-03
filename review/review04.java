package review;

import java.util.Scanner;

public class review04 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite sua idade: ");
        int idade = scanner.nextInt();
        boolean maiorIdade;

        if(idade>=18){
            maiorIdade = true;
        } else {
            maiorIdade = false;
        }

        System.out.println(maiorIdade);
    }
}
