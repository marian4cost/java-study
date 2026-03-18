package poo.exercise;

class Matricula{
    String nome;
    String matricula;

    public void apresentar(String nome){
        System.out.println("oie, eu sou " + nome);
    }
}

class Aluno extends Matricula{}

class Professor extends Matricula{
    double salario;

    public void professor(double salario){
        System.out.println("com sálario de " + salario);
    }
}

public class exercise08 {
    public void main(String[] args){
        Aluno aluno = new Aluno();
        aluno.apresentar("aluno01");

        Professor professor = new Professor();
        professor.apresentar("professor01");
        professor.professor(2500);
    }
}
