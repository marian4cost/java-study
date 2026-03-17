package poo;

class Conta{
    private float saldo = 1000;

    public void deposito(int valor){
        saldo += valor;
        System.out.println("o saldo atual é de R$" + saldo);
    }
}

public class study05 {
    public void main(String[] args){
        Conta conta = new Conta();
        conta.deposito(50);
    }
}
