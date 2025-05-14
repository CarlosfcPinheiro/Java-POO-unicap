package Q3;

import Q3.entity.Desenvolvedor;
import Q3.entity.Empresa;
import Q3.entity.Estagiario;
import Q3.entity.Funcionario;
import Q3.exception.baseSalaryException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            Desenvolvedor dev = new Desenvolvedor("Carlos", 2000, 1.5);
            Estagiario estagiario = new Estagiario("Paulo", 1000);

            List<Funcionario> funcionarios = new ArrayList<>();
            funcionarios.add(estagiario);
            funcionarios.add(dev);

            Empresa emp = new Empresa(funcionarios);
            System.out.println("Folha de pagamento: " + emp.calcularFolhaDePagamento());
        } catch (baseSalaryException e){
            System.out.println(e.getMessage());
        }
    }
}
