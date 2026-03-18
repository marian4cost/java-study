package poo.exercise;

class Product{
    String nome;
    private int quantidade = 40;

    public void adicionar(int qnt){
        quantidade += qnt;
        System.out.println("ao adicionar temos agora " + quantidade + " itens");
    }

    public void remover(int qnt) {
        if (qnt <= quantidade) {
            quantidade -= qnt;
            System.out.println("ao remover temos agora " + quantidade + " itens");
        } else {
            System.out.println("valor de itens indisponível");
        }
    }

}

public class exercise07 {
    public void main(String[] args){
        Product produto = new Product();

        produto.adicionar(10);

        produto.remover(5);

        produto.remover(46);
    }
}
