import java.util.Scanner;

public class EX6 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia da semana (em letras minúsculas): ");
        String diaDaSemana = sc.nextLine();
        sc.close();

        switch (diaDaSemana) {
            case "segunda", "terça", "quarta", "quinta", "sexta" -> System.out.println("Dia útil");
            case "sábado", "domingo" -> System.out.println("Não é um dia útil");
            default -> System.out.println("Dia inválido!");
        }
    }
}
