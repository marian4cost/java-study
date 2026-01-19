import java.util.Scanner;

public class exercise03 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um valor em celsius: ");
        double celsius = scanner.nextFloat();

        double farent = celsius * 1.8 + 32;

        System.out.print("o valor em farenheit é " + farent);
    }
}
