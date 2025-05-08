package Q11.entity;

public class EnvioWhatsApp implements EnvioMensagem{

    @Override
    public boolean enviar(String mensagem) {
        if (mensagem.trim().equals("")){
            return false;
        }

        return true;
    }

    @Override
    public String obterStatus() {
        return "Mensagem enviada via WhatsApp";
    }
}
