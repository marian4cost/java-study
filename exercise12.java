import java.util.Scanner;

public class exercise12 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("idade: ");
        int idade = scanner.nextInt();

        if(idade < 12){
            System.out.print("o usuário é criança");
        } else if (idade < 18){
            System.out.print("o usuário é adolescente");
        } else if (idade < 60){
            System.out.print("o usuário é adulto");
        } else {
            System.out.print("o usuário é idoso");
        }
    }
}
