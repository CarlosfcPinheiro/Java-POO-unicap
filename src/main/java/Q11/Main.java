package Q11;

import Q11.entity.EnvioEmail;
import Q11.entity.EnvioSMS;
import Q11.entity.GestorMensagens;

public class Main {
    public static void main(String[] args) {
        EnvioEmail email = new EnvioEmail();
        EnvioSMS sms = new EnvioSMS();

        GestorMensagens.enviarMensagem(email, "Olá, bom dia!");
        GestorMensagens.enviarMensagem(sms, "Como vai?");
    }
}
