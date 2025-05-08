package Q10.entity;

import java.util.ArrayList;
import java.util.List;

public class GestorProjeto {
    private List<MembroEquipe> membros;

    public GestorProjeto(){
        membros = new ArrayList<MembroEquipe>();
    }

    public void adicionarMembro(MembroEquipe membro){
        membros.add(membro);
    }

    public static String exibirRelatorio(MembroEquipe membro){
        return "NOME: " + membro.getNome() + ", PROJETO: " + membro.getProjeto() + ", TAREFA ATUAL: " + membro.trabalhar();
    }
}
