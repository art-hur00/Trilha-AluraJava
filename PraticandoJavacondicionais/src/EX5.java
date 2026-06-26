import java.util.Scanner;

public class EX5 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra\n(Exempol: 10,00): ");
        double valorBruto = sc.nextDouble();
        sc.close();

        if(valorBruto >= 100){
            double valorComDesconto =  valorBruto - ( valorBruto / 10 );
            System.out.println("Desconto de 10% aplicado.\nNovo valor: "+ valorComDesconto);
        }else{
            System.out.println("Nenhum desconto aplicado. \n" +
                    "Valor total: R$ " + valorBruto);
        }
    }
}
