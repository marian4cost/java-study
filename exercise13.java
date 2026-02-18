import java.util.Scanner;

public class exercise13 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("número: ");
        int number = scanner.nextInt();

        if(number < 0){
            System.out.print("negativo");
        } else if (number > 0){
            System.out.print("positivo");
        } else {
            System.out.print("0");
        }
    }
}
