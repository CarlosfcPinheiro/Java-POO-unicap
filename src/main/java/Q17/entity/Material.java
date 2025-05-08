package Q17.entity;

public abstract class Material {
    private String titulo;

    public Material(String titulo) {
        this.titulo = titulo;
    }

    public abstract String informarMaterial();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
