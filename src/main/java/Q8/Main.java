package Q8;

import Q8.entity.Livro;
import Q8.entity.Revista;
import Q8.entity.SistemaBiblioteca;
import Q8.exception.MaterialOutOfDevolution;

public class Main {
    public static void main(String[] args) {
        try{
            Livro livro = new Livro("Cosmos", 23);
            Revista revista = new Revista("Apollo 11: Tudo sobre", 4);

            SistemaBiblioteca sisBib = new SistemaBiblioteca();
            String info1 = sisBib.registrarEmprestimo(livro);
            String info2 = sisBib.registrarEmprestimo(revista);

            System.out.println(info1);
            System.out.println(info2);
        } catch (MaterialOutOfDevolution e){
            System.out.println(e.getMessage());
        }
    }
}
