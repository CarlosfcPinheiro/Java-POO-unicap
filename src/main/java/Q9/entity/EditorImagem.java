package Q9.entity;

public class EditorImagem {
    public static String exibirInformacoes(Imagem imagem){
        return "LARGURA: " + imagem.getLargura() + ", ALTURA: " + imagem.getAltura();
    }

    public static Imagem ajustarImagem(Imagem imagem, int novaLargura, int novaAltura){
        imagem.setLargura(novaLargura);
        imagem.setAltura(novaAltura);

        return imagem;
    }
}
