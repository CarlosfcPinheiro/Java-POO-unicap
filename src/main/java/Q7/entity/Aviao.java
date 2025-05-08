package Q7.entity;

public class Aviao extends Veiculo{

    public Aviao(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    @Override
    public String tipoCombustivel() {
        return "Querosene de aviação";
    }
}
