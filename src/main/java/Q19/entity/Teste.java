package Q19.entity;

public class Teste extends Tarefa{

    public Teste(String descricao) {
        super(descricao);
    }

    @Override
    public String realizarTarefa() {
        return "Executando tarefa de Teste";
    }
}
