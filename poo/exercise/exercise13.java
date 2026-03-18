package poo.exercise;

class Carros{
    private String marca;
    private String modelo;
    private int ano;

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return ano;
    }

    public void exibirInfo(){
        System.out.println(getMarca());
        System.out.println(getModelo());
        System.out.println(getAno());
    }
}

public class exercise13 {
    public void main(String[] args){
        Carros carro = new Carros();

        carro.setMarca("marca01");
        carro.setModelo("modelo01");
        carro.setAno(2026);

        carro.exibirInfo();
    }
}
