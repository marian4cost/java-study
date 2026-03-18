package poo;

class Animal{
    String nome;

    public void som(){
        System.out.println("som qualquer --padrão");
    }
}

class Cachorro extends Animal{} // é como se a classe cachorro chame o conteúdo/emissões da classe animal

public class study07 {
    public void main(String[] args){
        Cachorro c = new Cachorro();
        c.nome = "thor";
        c.som();
    }
}
