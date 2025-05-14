package Q7;

import Q7.entity.Aviao;
import Q7.entity.Carro;
import Q7.entity.GestorDeTransporte;
import Q7.exception.DistanceOutOfLimitException;

public class Main {
    public static void main(String[] args) {
        try {
            Aviao aviao = new Aviao(150, 14000);
            Carro carro = new Carro(5, 120);

            String aviao1Calc = GestorDeTransporte.calcularViagem(aviao, 6000);
            String carro1Calc = GestorDeTransporte.calcularViagem(carro, 800);

            System.out.println(aviao1Calc);
            System.out.println(carro1Calc);
        } catch(DistanceOutOfLimitException e){
            System.out.println(e.getMessage());
        }
    }
}
