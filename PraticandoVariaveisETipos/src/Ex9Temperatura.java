public class Ex9Temperatura {

    //Declaração de variáveis
    private int tempEmC;
    private double tempEmFahr;

    //Getters e Setters
    public double getTempEmFahr() {
        return tempEmFahr;
    }

    public void setTempEmFahr(double tempEmFahr) {
        this.tempEmFahr = tempEmFahr;
    }

    public int getTempEmC() {
        return tempEmC;
    }

    public void setTempEmC(int tempEmC) {
        this.tempEmC = tempEmC;
    }

    //Método para conversão
    public double converte(int tempEmC){
        return  tempEmFahr = ((tempEmC * 9 /5) + 32);
    }
}
