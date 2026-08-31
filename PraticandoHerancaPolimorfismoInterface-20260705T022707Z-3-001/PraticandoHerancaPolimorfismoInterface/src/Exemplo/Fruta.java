package Exemplo;

public class Fruta {
     private String tipo;
     private String cor;
     private boolean caroco = true;

     public boolean getCaroco() {
          return caroco;
     }

     public void setCaroco(boolean caroco) {
          this.caroco = caroco;
     }

     public Fruta(String tipo, String cor) {
         this.tipo = tipo;
         this.cor = cor;
    }

    public void exibirFruta(){
          System.out.printf("\nTipo da fruta: %s \nCor da fruta: %s", tipo, cor);
     }

     public void temCaroco(){
          if(caroco){
               System.out.printf("\nFruta %s:O Tem caroco", tipo);
          }else{
               System.out.printf("\nFruta %s: Nao tem caroco", tipo);
          }

     }
}
