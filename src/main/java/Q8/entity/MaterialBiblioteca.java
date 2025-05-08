package Q8.entity;

public abstract class MaterialBiblioteca {
    private String titulo;
    private int prazoDevolucao;

    public MaterialBiblioteca(String titulo, int prazoDevolucao) {
        this.titulo = titulo;
        this.prazoDevolucao = prazoDevolucao;
    }

    public double calcularMulta(int diasAtraso){
        return diasAtraso*1.5;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrazoDevolucao() {
        return prazoDevolucao;
    }

    public void setPrazoDevolucao(int prazoDevolucao) {
        this.prazoDevolucao = prazoDevolucao;
    }
}
