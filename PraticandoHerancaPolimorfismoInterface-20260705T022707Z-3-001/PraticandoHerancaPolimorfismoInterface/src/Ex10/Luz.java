package Ex10;

public class Luz implements Controlavel{
    private boolean ligado = false;

    @Override
    public void ligar() {
        if(this.ligado == false){
            this.ligado = true;
            System.out.println("Luz ligada.");
        }else{
            System.out.println("Luz já está ligada.");
        }
    }

    @Override
    public void desligar() {
        if(this.ligado == true){
            this.ligado = false;
            System.out.println("Luz desligada");
        }else{
            System.out.println("Luz já está desligada.");
        }
    }
}
