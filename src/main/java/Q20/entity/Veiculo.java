package Q20.entity;

public abstract class Veiculo {
    private String modelo;
    private int capacidade;

    public Veiculo(String modelo, int capacidade) {
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

    public abstract double calcularTempo(double distancia);

    @Override
    public String toString(){
        return "MODELO: " + modelo + ", CAPACIDADE: " + capacidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
