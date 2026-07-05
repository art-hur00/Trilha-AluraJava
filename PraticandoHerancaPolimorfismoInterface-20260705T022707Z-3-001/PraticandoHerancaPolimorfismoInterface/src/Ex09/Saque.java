package Ex09;

public class Saque extends OperacaoBancaria{

    public Saque(double valor){
        super(valor);
    }

    @Override
    public void executar() {
        System.out.println("Saque de R$"+getValor()+" realziado");
    }
}
