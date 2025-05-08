package Q19.entity;

public class Design extends Tarefa{

    public Design(String descricao) {
        super(descricao);
    }

    @Override
    public String realizarTarefa() {
        return "Realizando tarefa de design";
    }
}
