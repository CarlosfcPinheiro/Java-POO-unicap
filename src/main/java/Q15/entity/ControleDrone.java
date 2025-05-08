package Q15.entity;

public class ControleDrone implements ControleAutonomo{

    @Override
    public String iniciarRota(String destino){
        return "Rota do drone iniciada com destino para: " + destino;
    }

    @Override
    public String ajustarVelocidade(double velocidade){
        return "Velocidade atual do drone: " + velocidade;
    }
}
