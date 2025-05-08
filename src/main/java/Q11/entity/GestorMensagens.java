package Q11.entity;

public class GestorMensagens {
    public static boolean enviarMensagem(EnvioMensagem envio, String mensagem){
        boolean enviada = envio.enviar(mensagem);

        if (enviada) System.out.println(envio.obterStatus());
        else System.out.println("Mensagem não enviada.");

        return enviada;
    }
}
