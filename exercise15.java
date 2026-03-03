import java.util.Scanner;

public class exercise15 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("quantos dias você vai treinar na semana: ");
        int dias = scanner.nextInt();

        float minutosTotal = 0;
        int contadorMais60 = 0;

        if(dias<=7){
            System.out.println("vamos para a solução");

            for(int i = 1; i<= dias; i++){
                System.out.print("quantos minutos treinados hoje (dia " + i + "): ");
                float minutosDia = scanner.nextFloat();

                if(minutosDia>60){
                    contadorMais60 =+ 1;
                }

                minutosTotal = minutosTotal + minutosDia;
            }

            float mediaMinutos = minutosTotal/dias;

            System.out.println("total de minutos treinados na semana: " + minutosTotal);
            System.out.println("média de minutos por dia: " + mediaMinutos);
            System.out.println("dias com treinos acima de 60 minutos: " + contadorMais60);
        }else{
            System.out.print("valor inválido");
        }
    }
}
