package Q5.entity;

public class ContaCorrente extends Conta{
    private final double taxa = 1.50;

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void depositar(double valor){
        setSaldo(getSaldo()+valor-taxa);
    }

    @Override
    public void sacar(double valor){
        setSaldo(getSaldo()-valor-taxa);
    }

    @Override
    public String toString(){
        return "Titular: " + getTitular() + ", Saldo: " + getSaldo() + ", Tipo de conta: Corrente" + ", Operações: depositar e sacar";
    }
}
