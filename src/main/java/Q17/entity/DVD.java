package Q17.entity;

public class DVD extends Material{
    public DVD(String titulo) {
        super(titulo);
    }

    @Override
    public String informarMaterial() {
        return "O DVD tem o título: " + getTitulo();
    }

    @Override
    public String toString() {
        return "MATERIAL: DVD" + "\n TÍTULO: " + getTitulo();
    }
}
