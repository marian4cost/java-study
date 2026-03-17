import java.util.Scanner;

public class exercise16 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int value;
        System.out.println("quantos valores no vetor: ");
        value = scanner.nextInt();

        int[] numbers = new int[value];

        for(int i = 1; i <= value; i++){
            System.out.println("qual valor do vetor na posição " + i);
            numbers[(i-1)] = scanner.nextInt();
        }

        System.out.println("percorrendo o vetor");
        for(int j = 1; j <= value; j++){
            System.out.println(numbers[(j-1)]);
        }
    }
}
