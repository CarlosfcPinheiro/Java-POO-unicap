package Q5.entity;

import Q5.exception.TitularNullOrBlankException;

public abstract class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldo) {
        if (titular == null || titular.equals("")) throw new TitularNullOrBlankException();

        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
