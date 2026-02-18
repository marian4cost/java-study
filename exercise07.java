import java.util.Scanner;

public class exercise07 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("número 1: ");
        int number1 = scanner.nextInt();

        System.out.println("número 2: ");
        int number2 = scanner.nextInt();

        int soma = number1 + number2;
        int sub = number1 - number2;
        int multi = number1 * number2;
        int div = number1 / number2;
        int resto = number1%number2;

        System.out.print("soma: " + soma + " subtração: " + sub + " multiplicação: " + multi + " divisão: " + div + " resto: " + resto);
    }
}
