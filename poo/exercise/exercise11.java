package poo.exercise;

class Alunos{
    String nome;
    int idade;

    Alunos(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

        System.out.println("o aluno " + nome + " tem " + idade + " anos");
    }
}

public class exercise11 {
    public void main(String[] args){
        Alunos aluno = new Alunos("genisson", 19);
    }
}
