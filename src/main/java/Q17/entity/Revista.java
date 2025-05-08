package Q17.entity;

public class Revista extends Material{
    public Revista(String titulo) {
        super(titulo);
    }

    @Override
    public String informarMaterial() {
        return "A revista possui um título: " + getTitulo();
    }

    @Override
    public String toString() {
        return "MATERIAL: Revista" + "\n TÍTULO: " + getTitulo();
    }
}
