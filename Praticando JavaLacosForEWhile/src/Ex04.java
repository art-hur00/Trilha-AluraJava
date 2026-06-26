import java.util.Scanner;

public class Ex04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fatorial = 1;
        System.out.println("Digite um número: ");

        for(int contador = sc.nextInt(); contador > 0; contador--){
            fatorial *= contador;
        }
        sc.close();
        System.out.println("O fatorial de 5 é: " + fatorial);
    }
}
