import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em Real: ");
        double valorEmReal = sc.nextDouble();

        double valorEmDolar = valorEmReal / 5.25;
        System.out.println("O valor em dólares é: US$ "+ valorEmDolar);
    }
}
