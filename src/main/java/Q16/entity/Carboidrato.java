package Q16.entity;

public class Carboidrato extends Ingrediente{

    public Carboidrato(String nome, double quantidade) {
        super(nome, quantidade);
    }

    @Override
    public String informar() {
        return "NOME: " + getNome() + "\nQUANTIDADE DE CARBOIDRATO: " + getQuantidade();
    }
}
