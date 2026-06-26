import java.util.Scanner;

public class EX4 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = sc.nextInt();

        if(primeiroNumero > segundoNumero){
            System.out.println("O maior número é " + primeiroNumero);
        }else if(primeiroNumero == segundoNumero){
            System.out.println("Ambos são iguais.");
        }else{
            System.out.println("O maior número é " + segundoNumero);
        }
    }
}
