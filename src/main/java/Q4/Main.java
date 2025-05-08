package Q4;

import Q4.Entity.Computador;
import Q4.Entity.Loja;
import Q4.Entity.Produto;
import Q4.Entity.Tablet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Computador comp = new Computador("Notbook Dell", 1500);
        Tablet tablet = new Tablet("Tablet Samsung", 1000);

        List<Produto> lista = new ArrayList<>();
        lista.add(comp);
        lista.add(tablet);

        Loja loja = new Loja(lista);
        loja.listarGarantias();
    }
}
