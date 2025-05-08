package Q5.entity;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    public void adicionarRendimento(double perRendimento){
        setSaldo(getSaldo()+(getSaldo()*perRendimento));
    }

    @Override
    public String toString(){
        return "Titular: " + getTitular() + ", Saldo: " + getSaldo() + ", Tipo de conta: Poupança" + ", Operações: depositar, sacar e adicionar rendimento";
    }
}
