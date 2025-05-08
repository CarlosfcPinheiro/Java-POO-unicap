package Q9.entity;

public class ImagemColorida extends Imagem{


    public ImagemColorida(int largura, int altura) {
        super(largura, altura);
    }

    @Override
    public String processar() {
        return "Imagem com filtro de saturação.";
    }
}
