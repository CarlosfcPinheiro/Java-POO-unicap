package Q17.entity;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Material> materiais;

    public Usuario(String nome) {
        this.nome = nome;
        materiais = new ArrayList<>();
    }

    public void adicionarMaterial(Material material) {
        materiais.add(material);
    }

    public void listarMateriais(){
        materiais.forEach(material -> System.out.println(material));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Material> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<Material> materiais) {
        this.materiais = materiais;
    }
}
