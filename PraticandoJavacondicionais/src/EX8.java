import java.util.Scanner;

public class EX8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro lado: ");
        int lado1 = sc.nextInt();

        System.out.println("Digite o valor do segundo lado: ");
        int lado2 = sc.nextInt();

        System.out.println("Digite o valor do terceiro lado: ");
        int lado3 = sc.nextInt();
        sc.close();

        if((lado1 + lado2) > lado3 && (lado2 + lado3) > lado1 && (lado3 + lado1) > lado2){
            System.out.println("Os lados podem formar um triângulo.");
        }else{
            System.out.println("Os lados não podem formar um triângulo.");
        }
    }
}
