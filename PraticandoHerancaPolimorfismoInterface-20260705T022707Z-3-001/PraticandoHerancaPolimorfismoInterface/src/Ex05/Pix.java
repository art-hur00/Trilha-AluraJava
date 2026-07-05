package Ex05;

public class Pix extends Pagemento {

    public Pix(double valor){
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.println("Pagamento via Pix de R$"+getValor()+" confirmado");
    }
}
