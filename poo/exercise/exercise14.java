package poo.exercise;

class Veiculo{
    String modelo;

    public void buzinar(){
        System.out.println("carro buzinando");
    }
}

class Carr extends Veiculo{
    int ano;
}

class Moto extends Veiculo{
    @Override
    public void buzinar(){
        System.out.println("moto buzinando");
    }
}

public class exercise14 {
    public void main(String[] args){
        Carr carro = new Carr();
        carro.buzinar();

        Moto moto = new Moto();
        moto.buzinar();
    }
}
