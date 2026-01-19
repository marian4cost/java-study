import java.util.Scanner;

public class exercise02 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um número interiro: ");
        int number01 = scanner.nextInt();

        System.out.print("digite mais um número interiro: ");
        int number02 = scanner.nextInt();

        int sum = number01 + number02;
        int sub = number01 - number02;
        int mult = number01 * number02;
        int div = number01 / number02;

        System.out.println("soma: " + sum + " subtração: " + sub + " multiplicação: " + mult + " divisão: " + div);
    }
}
