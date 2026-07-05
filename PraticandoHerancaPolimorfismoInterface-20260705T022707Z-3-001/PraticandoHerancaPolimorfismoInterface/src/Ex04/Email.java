package Ex04;

public class Email extends Notificacao {
    private String assunto;

    public Email(String mensagem, String destinatario, String assunto){
        super(mensagem, destinatario);
    }

    public void enviar(String mensagem, String destinatario, String assunto){
        System.out.printf("\nEnviando Email para: %s\nAssunto: %s\nCorpo: %s", destinatario, assunto, mensagem);
    }
}
