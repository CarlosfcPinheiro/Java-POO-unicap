package Q16.entity;

public class Proteina extends Ingrediente{

    public Proteina(String nome, double quantidade) {
        super(nome, quantidade);
    }

    @Override
    public String informar() {
        return "NOME: " + getNome() + "\nQUANTIDADE DE PROTEÍNA: " + getQuantidade();
    }
}
