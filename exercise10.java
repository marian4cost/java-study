import java.util.Scanner;

public class exercise10 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("minutos: ");
        int minutos = scanner.nextInt();

        int horas = minutos/60;

        System.out.print("em horas temos: " + horas);
    }
}
