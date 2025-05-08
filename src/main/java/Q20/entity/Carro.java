package Q20.entity;

public class Carro extends Veiculo{
    private final double velocidadeEspecifica;

    public Carro(String modelo, int capacidade, double velocidadeEspecifica){
        super(modelo, capacidade);
        this.velocidadeEspecifica = velocidadeEspecifica;
    }

    @Override
    public double calcularTempo(double distancia){
        return distancia*velocidadeEspecifica;
    }
}
