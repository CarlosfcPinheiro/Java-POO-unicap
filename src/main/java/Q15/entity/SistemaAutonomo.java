package Q15.entity;

public class SistemaAutonomo {
    public static String navegar(ControleAutonomo controle, String destino, double velocidade){
        controle.iniciarRota(destino);
        controle.ajustarVelocidade(velocidade);

        return "Rota e velocidade iniciadas.";
    }
}
