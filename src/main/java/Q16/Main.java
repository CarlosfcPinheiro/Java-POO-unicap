package Q16;

import Q16.entity.Carboidrato;
import Q16.entity.Prato;
import Q16.entity.Proteina;
import Q16.entity.Tempero;

public class Main {
    public static void main(String[] args) {
        Proteina prot = new Proteina("Carne", 300);
        Tempero temp = new Tempero("Sal", 10);
        Carboidrato carb = new Carboidrato("Arroz", 600);

        Prato prato = new Prato("Arroz com carne");
        prato.adicionarIngrediente(prot);
        prato.adicionarIngrediente(temp);
        prato.adicionarIngrediente(carb);

        prato.listarIngredientes();
    }
}
