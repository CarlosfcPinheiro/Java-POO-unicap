package Q20.entity;

import java.util.ArrayList;
import java.util.List;

public class Rota{
    private String origem;
    private String destino;
    private List<Veiculo> veiculosDisponiveis;

    public Rota(String origem, String destino){
        this.origem = origem;
        this.destino = destino;
        veiculosDisponiveis = new ArrayList<Veiculo>();
    }

    public void adicionarVeiculo(Veiculo veiculo){
        veiculosDisponiveis.add(veiculo);
    }

    public void listarVeiculosDisponiveis(){
        veiculosDisponiveis.forEach(veiculo -> System.out.println(veiculo + "\n"));
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public List<Veiculo> getVeiculosDisponiveis() {
        return veiculosDisponiveis;
    }

    public void setVeiculosDisponiveis(List<Veiculo> veiculosDisponiveis) {
        this.veiculosDisponiveis = veiculosDisponiveis;
    }
}
