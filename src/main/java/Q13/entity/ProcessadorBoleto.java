package Q13.entity;

public class ProcessadorBoleto implements ProcessadorPagamento{
    @Override
    public boolean autorizarPagamento(double valor){
        if (valor < 0) throw new IllegalArgumentException("Valor inválido");

        return (valor > 10);
    }

    @Override
    public boolean processarPagamento(double valor){
        if (!autorizarPagamento(valor)){
            System.out.println("Pagamento não autorizado");
            return false;
        }

        System.out.println("Pagamento efetuado com sucesso!");
        return true;
    }
}
