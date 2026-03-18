package poo.exercise;

class Media{
    private String nome;
    private double nota1;
    private double nota2;

    public void aprovado(double nota1, double nota2){
        double media = (nota1 + nota2) / 2;

        boolean result;

        if(media >= 7){
            result = true;
        }
        else {
            result = false;
        }

        System.out.println(result);
    }
}

public class exercise06 {
    public void main(String[] args){
        Media media = new Media();
        media.aprovado(5, 4.7);
    }
}
