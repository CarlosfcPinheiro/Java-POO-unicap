package Q19.entity;

public class Desenvolvimento extends Tarefa{

    public Desenvolvimento(String descricao) {
        super(descricao);
    }

    @Override
    public String realizarTarefa() {
        return "Realizando tarefa de desenvolvimento";
    }
}
