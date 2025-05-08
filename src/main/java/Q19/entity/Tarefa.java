package Q19.entity;

public abstract class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public abstract String realizarTarefa();

    @Override
    public String toString(){
        return "DESCRICAO TAREFA: " + descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
