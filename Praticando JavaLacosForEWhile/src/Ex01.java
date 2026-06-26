import java.util.Scanner;

public class Ex01 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite a quantidade de degraus");
        int quantidadeDegraus = sc.nextInt();
        for(int i = 1; i<= quantidadeDegraus; i++){
            System.out.println("Subindo o degrau "+ i);
        }

    }
}