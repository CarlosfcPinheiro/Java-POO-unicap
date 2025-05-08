package Q3.entity;

import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public double calcularFolhaDePagamento(){
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }

        return total;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
