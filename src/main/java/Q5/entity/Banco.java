package Q5.entity;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco(){
        this.contas = new ArrayList<Conta>();
    }

    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }

    public void gerarRelatorio(){
        for (Conta conta : this.contas) {
            System.out.println(conta.toString());
        }
    }
}
