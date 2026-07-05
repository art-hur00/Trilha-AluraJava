package Ex06;

public class Notificacao {

    public void enviarMensagem(String mensagem1){
        System.out.println("Mensagem enviada para todos: "+ mensagem1);
    }
    public void enviarMensagem(String mensagem1, String mensagem2){
        System.out.println("Mensagem para " + mensagem1 +": " + mensagem2);
    }

    public void enviarMensagem(String mensagem1, String mensagem2, int repeticoes){
        for(int i =0; i< repeticoes; i++){
            System.out.println("Mensagem para " + mensagem1 +": " + mensagem2);
        }
    }
}
