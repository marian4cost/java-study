package poo;

class Produto{
    String nome;
    private double preco = 50;

    public void alterationPreco(double valor){
        if(valor > 0){
            this.preco = valor;
        }
        else {
            System.out.println("valor negativo ou 0 não é válido");
        }
    }
}

public class study06 {
    public void main(String[] args){
        Produto produto = new Produto();

        produto.alterationPreco(100);
    }
}
