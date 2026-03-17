package poo;

class Pessoa{
    String name;
    int age;

    void frase(){
        System.out.println("meu nome é " + name + " e tenho " + " anos");
    }
}

public class study03 {
    public void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa.name = "user01";
        pessoa.age = 19;

        pessoa.frase();
    }
}
