package Ex05;

public class Boleto extends Pagemento{
    private double taxa = 0.01;

    public Boleto(double valor){
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.println("Boleto de R$"+ getValor()+ " gerado com sucesso (Taxa: R$"+ getValor() * taxa+")");
    }
}
