import java.util.Scanner;

public class EX1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número que deseja verificar: ");
        int numero = sc.nextInt();

        if(numero % 2 == 0)
            System.out.println("o número "+ numero + "é par");
        else
            System.out.println("o número "+ numero + "é ímpar");
    }
}
