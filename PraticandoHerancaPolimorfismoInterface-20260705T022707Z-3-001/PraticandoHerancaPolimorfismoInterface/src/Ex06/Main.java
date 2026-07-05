package Ex06;

public class Main {
    static void main(String[] args) {
        Notificacao notificacao = new Notificacao();

        notificacao.enviarMensagem("Olá!");
        notificacao.enviarMensagem("João", "Bom dia!");
        notificacao.enviarMensagem("Maria", "Atenção!", 2);
    }
}
