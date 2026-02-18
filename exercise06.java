import java.util.Scanner;

public class exercise06 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("nota 1: ");
        double nota1 = scanner.nextFloat();

        System.out.println("nota 2: ");
        double nota2 = scanner.nextFloat();

        System.out.println("nota 3: ");
        double nota3 = scanner.nextFloat();

        double media = (nota1 + nota2 + nota3)/3;

        System.out.print("a média das 3 notas é " + media);
    }
}
