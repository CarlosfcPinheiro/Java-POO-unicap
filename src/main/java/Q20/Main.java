package Q20;

import Q20.entity.Carro;
import Q20.entity.Moto;
import Q20.entity.Rota;

public class Main {
    public static void main(String[] args) {
        Carro v1 = new Carro("BYD", 5, 100);
        Moto v2 = new Moto("Honda", 2, 150);

        Rota r = new Rota("Recife", "Fortaleza");
        r.adicionarVeiculo(v1);
        r.adicionarVeiculo(v2);

        r.listarVeiculosDisponiveis();
    }
}
