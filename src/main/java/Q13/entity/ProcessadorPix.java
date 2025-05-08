package Q13.entity;

public class ProcessadorPix implements ProcessadorPagamento{
    @Override
    public boolean autorizarPagamento(double valor){
        if (valor < 0) throw new IllegalArgumentException("Valor inválido");

        return true;
    }

    @Override
    public boolean processarPagamento(double valor){
        if (!autorizarPagamento(valor)){
            System.out.println("Pagamento não efetuado");
            return false;
        }

        System.out.println("Pagamento efetuado com sucesso!");
        return true;
    }
}
