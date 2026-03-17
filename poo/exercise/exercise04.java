package poo.exercise;

class Pokemon{
    String nome;
    String tipo;
    int nivel;
    double pontosVida;

    public Pokemon(String nome, String tipo, int nivel, double pontosVida){
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
        this.pontosVida = pontosVida;
    }

    public void atacar(){
        System.out.println(nome + " atacou");
    }

    public void receberDano(double dano){
        pontosVida = pontosVida - dano;
        System.out.println(nome + " com " + pontosVida + " pontos de vida");

        if(pontosVida == 0){
            System.out.println(nome + " desmaiou");
        }
    }
}

public class exercise04 {
    public void main(String[] args){
        Pokemon pikachu = new Pokemon("pikachu", "elétrico", 2, 15);
        Pokemon charmander = new Pokemon("charmander", "fogo", 3, 25);


        pikachu.atacar();
        charmander.receberDano(5);

        charmander.atacar();
        pikachu.receberDano(15);
    }
}
