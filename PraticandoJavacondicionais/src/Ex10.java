import java.util.Scanner;

public class Ex10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Ex10Codigo ver = new Ex10Codigo();
        System.out.println("Digite o código de acesso: ");
        int codigoFornecido = sc.nextInt();
        System.out.println("Digite o nível de acesso: ");
        int nivelDeAcesso = sc.nextInt();

        ver.verificaAcesso(codigoFornecido, nivelDeAcesso);
    }
}
