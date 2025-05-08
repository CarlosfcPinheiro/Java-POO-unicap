package Q20.entity;

public class Moto extends Veiculo{
    private double velocidadeAlta;

    public Moto(String modelo, int capacidade, double velocidadeAlta){
        super(modelo, capacidade);
        this.velocidadeAlta = velocidadeAlta;
    }

    @Override
    public double calcularTempo(double distancia){
        return distancia*velocidadeAlta;
    }

    public double getVelocidadeAlta() {
        return velocidadeAlta;
    }

    public void setVelocidadeAlta(double velocidadeAlta) {
        this.velocidadeAlta = velocidadeAlta;
    }
}
