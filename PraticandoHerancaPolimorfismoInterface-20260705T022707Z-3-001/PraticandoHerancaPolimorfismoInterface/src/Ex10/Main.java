package Ex10;

public class Main {
     static void main(String[] args) {
        Luz luz = new Luz();
        ArCondicionado ar = new ArCondicionado();
        luz.ligar();
        luz.ligar();
        luz.desligar();

        ar.desligar();
    }
}
