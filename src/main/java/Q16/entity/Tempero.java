package Q16.entity;

public class Tempero extends Ingrediente{

    public Tempero(String nome, double quantidade) {
        super(nome, quantidade);
    }

    @Override
    public String informar() {
        return "NOME: " + getNome() + "\nQUANTIDADE DE TEMPERO: " + getQuantidade();
    }
}
