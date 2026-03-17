package poo.exercise;

class Produto{
    String nome;
    double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void desconto(float percentual){
        this.preco = this.preco - (this.preco * percentual / 100);
        System.out.println(preco);
    }
}

public class exercise03 {
    public void main(String[] args){
        Produto produto = new Produto("café", 20);
        produto.desconto(10);
    }
}
