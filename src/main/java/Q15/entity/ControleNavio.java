package Q15.entity;

public class ControleNavio implements ControleAutonomo{

    @Override
    public String iniciarRota(String destino){
        return "Rota do navio iniciada com destino para: " + destino;
    }

    @Override
    public String ajustarVelocidade(double velocidade){
        return "Velocidade atual do navio: " + velocidade;
    }
}
