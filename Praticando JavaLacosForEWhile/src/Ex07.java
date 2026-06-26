import java.util.Scanner;

public class Ex07 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();
            nome = nome.trim();
            if(nome.length() >= 3){
                System.out.println("Nome " + nome + " cadastrado com sucesso!");
                break;
            }
            System.out.println("Nome inválido. Digite novamente.");
        }
    }
}