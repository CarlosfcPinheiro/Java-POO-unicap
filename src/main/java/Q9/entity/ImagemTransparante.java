package Q9.entity;

public class ImagemTransparante extends Imagem{
    public ImagemTransparante(int largura, int altura) {
        super(largura, altura);
    }

    @Override
    public String processar(){
        return "Máscara de transparência aplicada a imagem.";
    }
}
