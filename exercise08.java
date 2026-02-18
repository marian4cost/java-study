import java.util.Scanner;

public class exercise08 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("número: ");
        int number = scanner.nextInt();

        if(number%2 == 0){
            System.out.println(number + " é par");
        } else{
            System.out.print(number + " é ímpar");
        }
    }
}
