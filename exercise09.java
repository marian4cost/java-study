import java.util.Scanner;

public class exercise09 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("número: ");
        int number = scanner.nextInt();

        int quadrado = number * number;
        int cubo = number * number * number;

        System.out.println("o quadrado: " + quadrado + ", o cubo: " + cubo);
    }
}
