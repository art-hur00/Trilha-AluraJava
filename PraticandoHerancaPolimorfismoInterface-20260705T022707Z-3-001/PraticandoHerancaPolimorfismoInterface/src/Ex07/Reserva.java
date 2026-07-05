package Ex07;

public class Reserva {

    public void reservar(){
        System.out.println("Reserva reakizada");
    }
    public void reservar(String data){
        System.out.println("Reserva feita para o dia "+ data);
    }
    public void reservar(String data, int pessoas){
        System.out.println("Reserva feita para o dia "+ data + " para " + pessoas + " pessoas");
    }
}
