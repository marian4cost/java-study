package poo.exercise;

class Pessoa{
    String name;
    int age;
}

public class exercise01 {
    public void main(String[] args){
        Pessoa p1 = new Pessoa(), p2 = new Pessoa();
        p1.name = "genisson";
        p1.age = 19;

        p2.name = "mariana";
        p2.age = 19;

        System.out.println("nome " + p1.name + " idade " + p1.age);
        System.out.println("nome " + p2.name + " idade " + p2.age);
    }
}
