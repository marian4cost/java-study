package poo.exercise;

class Produtos{
    String nome;
    double preco;

    public void exibirInformacao(String nome, double preco){
        this.nome = nome;
        this.preco = preco;

        System.out.println("o produto " + nome + " esta no valor de R$" + preco);
    }
}

public class exercise10 {
    public void main(String[] args){
        Produtos produto = new Produtos();

        produto.exibirInformacao("maçã", 15.2);
    }
}
