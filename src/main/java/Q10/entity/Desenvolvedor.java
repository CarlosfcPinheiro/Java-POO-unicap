package Q10.entity;

public class Desenvolvedor extends MembroEquipe{

    public Desenvolvedor(String nome, String projeto) {
        super(nome, projeto);
    }

    @Override
    public String trabalhar() {
        return "Escrevendo código para o projeto.";
    }
}
