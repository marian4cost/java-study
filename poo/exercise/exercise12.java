package poo.exercise;

class Pessoas{
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }
}

public class exercise12 {
    public void main(String[] args){
        Pessoas pessoa = new Pessoas();

        pessoa.setNome("mariana");
        System.out.println(pessoa.getNome());

        pessoa.setIdade(19);
        System.out.println(pessoa.getIdade());
    }
}
