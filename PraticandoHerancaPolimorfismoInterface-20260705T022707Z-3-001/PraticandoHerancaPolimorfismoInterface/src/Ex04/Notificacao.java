package Ex04;


public class Notificacao {
    private String mensagem;
    private String destinatario;

    public String getMensagem() {
        return mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }
    public Notificacao(String mensagem, String destinatario){
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }
    public void enviar(String mensagem, String destinatario){
     System.out.println("Enviado " + "para " + destinatario +"\n" + mensagem);

    }

}
