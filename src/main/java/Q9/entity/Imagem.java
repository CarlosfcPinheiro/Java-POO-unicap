package Q9.entity;

public abstract class Imagem {
    private int largura;
    private int altura;

    public Imagem(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public int calcularTamanho(){
        return altura*largura;
    }

    public abstract String processar();

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
