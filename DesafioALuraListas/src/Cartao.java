public class Cartao {
    private double limiteDoCartao;

    public double getLimiteDoCartao() {
        return limiteDoCartao;
    }

    public void setLimiteDoCartao(double limiteDoCartao) {
        this.limiteDoCartao = limiteDoCartao;
    }


    public boolean realizarCompra(Compra compra) {
        if (limiteDoCartao >= compra.getValorDaCompra()) {
            limiteDoCartao -= compra.getValorDaCompra();
            System.out.println("Compra realizada!\nSaldo restante: " + limiteDoCartao);
            return true;
        }else{
            System.out.println("Compra não realizada, saldo insuficiente! ");
            return false;
        }
    }
}