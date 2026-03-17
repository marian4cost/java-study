package poo;

class Car{
    String modelo;
    int ano;

    public Car(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    public void frase(){
        System.out.println("o carro do modelo " + modelo + " é do ano " + ano);
    }
}

public class study04 {
    public void main(String[] args){
        Car car = new Car("hb20", 2015);
        car.frase();
    }
}
