package Q16.entity;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    private String nome;
    private List<Ingrediente> ingredientes;

    public Prato(String nome) {
        this.nome = nome;
        ingredientes = new ArrayList<Ingrediente>();
    }

    public void adicionarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void listarIngredientes() {
        ingredientes.forEach(ingrediente -> System.out.println(ingrediente + "\n"));
    }
}
