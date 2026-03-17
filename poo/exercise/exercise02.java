package poo.exercise;

class Carro{
    String modelo;
    int velocidade;

    public Carro(String modelo, int velocidade){
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public void acelerar(){
        velocidade += 10;
        System.out.println("acelerandoooooo " + velocidade);
    }

    public void frear(){
        if(velocidade >= 10){
            velocidade -= 10;
        }
        else {
            velocidade = 0;
        }
        System.out.println("freiandoooooo " + velocidade);
    }
}

public class exercise02 {
    public void main(String[] args){
        Carro carro = new Carro("", 7);
        carro.frear();
    }
}
