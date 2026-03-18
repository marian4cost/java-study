package poo;

class Funcionario{
    String nome;
    String cargo;
}

class Salario extends Funcionario{
    double salario;

    public void Salario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void setSalario(){
        System.out.println("o " + nome + " possui o cargo de " + cargo + "com um sálario de " + salario);
    }
}

public class study08 {
    public void main(String[] args){
        Salario valor = new Salario();
        valor.Salario("user1", "professor", 1.612);
        valor.setSalario();
    }
}
