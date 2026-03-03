package review;

import java.util.Random;
import java.util.Scanner;

public class review05 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int sorteio = random.nextInt(4);

        switch (sorteio){
            case 1:
                System.out.println("número 1 - mensagem 1");
            case 2:
                System.out.println("número 2 - mensagem 1");
            case 3:
                System.out.println("número 3 - mensagem 1");
        }
    }
}
