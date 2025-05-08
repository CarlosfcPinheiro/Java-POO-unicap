package Q12;

import Q12.entity.DescontoFidelidade;
import Q12.entity.DescontoPromocional;
import Q12.entity.GestorDeDescontos;

public class Main {
    public static void main(String[] args) {
        DescontoFidelidade desfi = new DescontoFidelidade();
        DescontoPromocional despro = new DescontoPromocional();

        GestorDeDescontos.aplicarDesconto(desfi, 240);
        GestorDeDescontos.aplicarDesconto(despro, 180);
    }
}
