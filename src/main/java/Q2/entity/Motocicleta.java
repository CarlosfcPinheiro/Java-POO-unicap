package Q2.entity;

public class Motocicleta extends Veiculo {
    private String tipoDeGuidao;

    public Motocicleta(String modelo, String marca, int ano, String tipoDeGuidao) {
        super(modelo, marca, ano);
        this.tipoDeGuidao = tipoDeGuidao;
    }

    @Override
    public void informacoes(){
        System.out.println("Modelo: " + getModelo() + " Marca: " + getMarca() + " Ano: " + getAno() + " tipoDeGuidao: " + tipoDeGuidao);
    }
}
