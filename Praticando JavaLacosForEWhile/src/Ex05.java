import java.util.Scanner;

public class Ex05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os números separados por espaço: ");
        String[] lista = sc.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for(String numStr : lista){
            int num = Integer.parseInt(numStr);
            if(num > maior){
                maior = num;
            }
        }
        System.out.println("O maior número é: " + maior);
        sc.close();
    }
}
