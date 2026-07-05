package Ex09;

public class Deposito extends OperacaoBancaria{

    public Deposito(double valor){
        super(valor);
    }

    @Override
    public void executar() {
        System.out.println("Depósito de R$" + getValor()+" realizado");
    }
}
