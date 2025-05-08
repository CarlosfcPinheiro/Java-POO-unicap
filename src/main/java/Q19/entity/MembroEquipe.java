package Q19.entity;

import java.util.ArrayList;
import java.util.List;

public class MembroEquipe implements Papel{
    private String nome;
    private Papel papel;
    private List<Tarefa> tarefas;

    public MembroEquipe(String nome, Papel papel) {
        this.nome = nome;
        this.papel = papel;
        tarefas = new ArrayList<Tarefa>();
    }

    @Override
    public String executarPapel(){
        return nome + ", membro da equipe, está executando seu papel";
    }

    public void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    public void listarTarefas(){
        System.out.println("TAREFAS DO MEMBRO: " + nome + "\n");
        tarefas.forEach(tarefa -> System.out.println(tarefa + "\n"));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
}
