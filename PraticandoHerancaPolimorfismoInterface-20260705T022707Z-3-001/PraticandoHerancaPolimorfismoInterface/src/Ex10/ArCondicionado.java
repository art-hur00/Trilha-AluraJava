package Ex10;

public class ArCondicionado implements Controlavel{
    private boolean ligado = false;

    @Override
    public void ligar() {
        if(this.ligado == false){
            this.ligado = true;
            System.out.println("Ar-condiconado ligado.");
        }else{
            System.out.println("Ar-condiconado já está ligada.");
        }
    }

    @Override
    public void desligar() {
        if(this.ligado == true){
            this.ligado = false;
            System.out.println("Ar-condiconado desligado");
        }else{
            System.out.println("Ar-condiconado já está desligado.");
        }
    }
}

