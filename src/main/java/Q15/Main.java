package Q15;

import Q15.entity.ControleCarro;
import Q15.entity.ControleDrone;
import Q15.entity.SistemaAutonomo;

public class Main {
    public static void main(String[] args) {
        ControleCarro cc = new ControleCarro();
        ControleDrone cd = new ControleDrone();

        cc.iniciarRota("Caruaru");
        cd.iniciarRota("Fernando de Noronha");

        String info = SistemaAutonomo.navegar(cc, "São Paulo", 80);
        System.out.println(info);
    }
}
