package Q19;

import Q19.entity.Design;
import Q19.entity.MembroEquipe;
import Q19.entity.Teste;

public class Main {
    public static void main(String[] args) {
        Teste t1 = new Teste("Escrever testes");
        Design t2 = new Design("Fazer logotipo");

        MembroEquipe mem = new MembroEquipe("Carlos", null);
        mem.adicionarTarefa(t1);
        mem.adicionarTarefa(t2);

        mem.listarTarefas();
    }
}
