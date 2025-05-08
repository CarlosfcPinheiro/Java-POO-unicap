package Q5;

import Q5.entity.Banco;
import Q5.entity.ContaCorrente;
import Q5.entity.ContaSalario;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente cc = new ContaCorrente("Carlos", 2000);
        ContaSalario cs = new ContaSalario("Pedro", 1500);

        banco.adicionarConta(cc);
        banco.adicionarConta(cs);

        banco.gerarRelatorio();
    }
}
