import java.util.Scanner;

public class Ex03 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        System.out.println("Digite um valor: ");
        for(int contador = sc.nextInt(); contador<= 100; contador++){
            if(contador % 2 == 0){
                soma += contador;
            }
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}
