package Ex05;

public class Cartao extends Pagemento{
    private double taxa = 0.03;

    public Cartao(double valor){
        super(valor);
    }
    @Override
    public void confirmarPagamento(){
        System.out.println("Pagamento de " + getValor() + " confirmado no Cartão de Crédito" + "(Taxa: R$"+ getValor() * taxa + ")");
    }
}
