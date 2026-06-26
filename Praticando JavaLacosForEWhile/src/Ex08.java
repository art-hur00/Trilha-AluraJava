import java.util.Scanner;

public class Ex08 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int somaDosPositivos = 0;
        int somaDosNegativos = 0;

        while(true){

            System.out.println("Digite um número (ou 'fim' para encerrar): ");
            String valorBruto = sc.nextLine();


            if(valorBruto.equals("fim")){
                System.out.println("Números positivos: " +somaDosPositivos);
                System.out.println("Números negativos: " + somaDosNegativos);
                break;
            }

            int valorProcessado = Integer.parseInt(valorBruto);

            if(valorProcessado > 0){
                somaDosPositivos ++;
            }else {
                somaDosNegativos++;
            }
        }
        sc.close();
    }
}
