import java.util.Scanner;

public class exercise05 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //imprimir antecessor e sucessor de um número

        System.out.print("digite um número: ");
        int number = scanner.nextInt();

        int antecessor = number-1;
        int sucessor = number+1;

        System.out.println("o antecessor: " + antecessor);
        System.out.println("o sucessor: " + sucessor);
    }
}
