package Q5;

import Q5.entity.Banco;
import Q5.entity.ContaCorrente;
import Q5.entity.ContaSalario;
import Q5.exception.TitularNullOrBlankException;

public class Main {
    public static void main(String[] args) {
        try{
            Banco banco = new Banco();

            ContaCorrente cc = new ContaCorrente("Carlos", 2000);
            ContaSalario cs = new ContaSalario("Pedro", 1500);

            banco.adicionarConta(cc);
            banco.adicionarConta(cs);

            banco.gerarRelatorio();
        } catch(TitularNullOrBlankException e){
            System.out.println(e.getMessage());
        }
    }
}
