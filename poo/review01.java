package poo;

import java.util.Random;

class Users{
    private int id;
    private String nome;
    private String email;
    private String senha;

    Users(int id, String nome, String email, String senha){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    Users(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;

        Random random = new Random();
        id = random.nextInt(10000);
    }

    public int getId(){
        return  id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void exibirinfo(){
        System.out.println("id: " + id);
        System.out.println("nome: " + nome);
        System.out.println("email: " + email);
    }
}

public class review01 {
    public void main(String[] args){
        Users usuario1 = new Users(10, "user10", "user10@", "total123**");
        usuario1.exibirinfo();

        Users usuario2 = new Users("user11", "user11@", "total123***");
        usuario2.exibirinfo();
    }
}
