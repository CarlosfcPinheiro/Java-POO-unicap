package Q3.entity;

import Q3.exception.baseSalaryException;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        if (salarioBase < 1000){
            throw new baseSalaryException();
        }

        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
