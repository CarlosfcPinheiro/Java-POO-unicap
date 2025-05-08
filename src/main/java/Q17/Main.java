package Q17;

import Q17.entity.DVD;
import Q17.entity.Livro;
import Q17.entity.Usuario;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Cosmos");
        DVD dvd = new DVD("Top 10 músicas");

        Usuario usuario = new Usuario("Carlos");
        usuario.adicionarMaterial(livro);
        usuario.adicionarMaterial(dvd);

        usuario.listarMateriais();
    }
}
