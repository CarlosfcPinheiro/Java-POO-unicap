package Q5.entity;

public class ContaSalario extends Conta{
    private int numeroSaques = 0;

    public ContaSalario(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void sacar(double valor){
        if (numeroSaques >= 5){
            throw new RuntimeException("Você já realizou o número máximo de saques mensais.");
        }

        numeroSaques++;
        setSaldo(getSaldo() - valor);
    }

    @Override
    public String toString(){
        return "Titular: " + getTitular() + ", Saldo: " + getSaldo() + ", Tipo de conta: Salário" + ", Operações: depositar e sacar";
    }
}
