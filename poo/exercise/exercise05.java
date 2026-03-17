package poo.exercise;

class Conta{
    String nome;
    private float saldo = 500;

    public void deposito(float valor){
        saldo += valor;
    }

    public void saque(float valor){
        if(valor <= saldo){
            saldo -= valor;
        }
        else{
            System.out.println("valor indismonível em sua conta");
        }
    }

    public void retorno(){
        System.out.println("saldo atual é de " + saldo);
    }
}

public class exercise05 {
    public void main(String[] args){
        Conta conta = new Conta();

        conta.deposito(100);
        conta.retorno();

        conta.saque(100);
        conta.retorno();

        conta.saque(650);
        conta.retorno();
    }
}
