package poo;

class Carro{
    String modelo;
    int ano;
}

public class study01 {
    public void main(String[] args) {
        Carro car = new Carro();
        car.modelo = "hb20";
        car.ano = 2015;

        System.out.println("carro do modelo " + car.modelo + " do ano de " + car.ano);
    }
}
