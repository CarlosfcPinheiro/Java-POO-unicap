package Q12.entity;

public class GestorDeDescontos {
    public static double aplicarDesconto(EstrategiaDesconto estrategia, double preco){
        System.out.println("Desconto de R$" + estrategia.calcularDesconto(preco) + " aplicado.");
        return estrategia.calcularDesconto(preco);
    }
}
