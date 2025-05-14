package Q7.entity;

import Q7.exception.DistanceOutOfLimitException;

public abstract class Veiculo {
    private int capacidade;
    private double velocidadeMaxima;

    public Veiculo(int capacidade, double velocidadeMaxima) {
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double calcularTempo(double distancia){
        if (distancia > 3000) throw new DistanceOutOfLimitException();

        return velocidadeMaxima*distancia;
    }

    public abstract String tipoCombustivel();

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
