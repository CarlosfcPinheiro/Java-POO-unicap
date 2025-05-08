package Q7.entity;

public abstract class Veiculo {
    private int capacidade;
    private double velocidadeMaxima;

    public Veiculo(int capacidade, double velocidadeMaxima) {
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double calcularTempo(double distancia){
        return velocidadeMaxima*distancia;
    }

    public abstract String tipoCombustivel();
}
