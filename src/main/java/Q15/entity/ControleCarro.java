package Q15.entity;

public class ControleCarro implements ControleAutonomo{
    @Override
    public String iniciarRota(String destino){
        return "Rota do carro iniciada com destino para: " + destino;
    }

    @Override
    public String ajustarVelocidade(double velocidade){
        return "Velocidade atual do carro: " + velocidade;
    }
}
