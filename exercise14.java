import java.util.Scanner;

public class exercise14 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int contador = 0;

        while(contador < 3){
            System.out.println("número: ");
            int number = scanner.nextInt();

            if(number > maior){
                maior = number;
            }

            contador = contador + 1;
        }

        System.out.print("o maior é " + maior);
    }
}
