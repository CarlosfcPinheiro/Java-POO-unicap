package Q7.entity;

public class Carro extends Veiculo{

    public Carro(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    @Override
    public String tipoCombustivel() {
        return "Gasolina";
    }
}
