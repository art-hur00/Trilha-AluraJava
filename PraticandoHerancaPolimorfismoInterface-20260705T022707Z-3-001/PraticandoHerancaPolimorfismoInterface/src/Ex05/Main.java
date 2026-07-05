package Ex05;

public class Main {
    static void main() {
        Pagemento cartao = new Cartao(250);
        Pagemento boleto = new Boleto(500);
        Pagemento pix = new Pix(300);

        cartao.confirmarPagamento();
        boleto.confirmarPagamento();
        pix.confirmarPagamento();

    }
}
