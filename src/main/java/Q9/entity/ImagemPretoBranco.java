package Q9.entity;

public class ImagemPretoBranco extends Imagem{
    public ImagemPretoBranco(int largura, int altura) {
        super(largura, altura);
    }

    @Override
    public String processar(){
        return "Imagem convertida para preto e branco.";
    }
}
