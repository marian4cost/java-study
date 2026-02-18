import java.util.Scanner;

public class exercise11 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("idade: ");
        int idade = scanner.nextInt();

        if(idade >= 16){
            System.out.print("pode votar");
        } else {
            System.out.print("ainda não pode votar");
        }
    }
}
