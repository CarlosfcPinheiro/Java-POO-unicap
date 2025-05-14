package Q4;

import Q4.entity.Computador;
import Q4.entity.Loja;
import Q4.entity.Produto;
import Q4.entity.Tablet;
import Q4.exception.PriceLessThanZeroException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            Computador comp = new Computador("Notbook Dell", 1500);
            Tablet tablet = new Tablet("Tablet Samsung", 1000);

            List<Produto> lista = new ArrayList<>();
            lista.add(comp);
            lista.add(tablet);

            Loja loja = new Loja(lista);
            loja.listarGarantias();
        } catch (PriceLessThanZeroException e){
            System.out.println(e.getMessage());
        }
    }
}
