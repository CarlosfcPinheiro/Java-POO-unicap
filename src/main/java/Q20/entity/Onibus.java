package Q20.entity;

public class Onibus extends Veiculo{
    private final double velocidadeFixa = 60;

    public Onibus(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    @Override
    public double calcularTempo(double distancia){
        return velocidadeFixa*distancia;
    }

    public double getVelocidadeFixa() {
        return velocidadeFixa;
    }
}
