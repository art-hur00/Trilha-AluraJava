import java.util.Scanner;

public class EX3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int senha = 12345;
        System.out.println("Digite a senha: ");
        int tentativaSenha = sc.nextInt();

        if(tentativaSenha == senha)
            System.out.println("Acesso permitido!");
        else
            System.out.println("Acesso negado!");
    }
}
