package Q17.entity;

public class Livro extends Material{

    public Livro(String titulo) {
        super(titulo);
    }

    @Override
    public String informarMaterial() {
        return "O livro possui o título: " + getTitulo();
    }

    @Override
    public String toString() {
        return "MATERIAL: Livro" + "\n TÍTULO: " + getTitulo();
    }
}
