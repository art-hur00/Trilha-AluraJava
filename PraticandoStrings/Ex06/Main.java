package Ex06;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        double valorSemFormatacao = scanner.nextDouble();
        String valorFormatado = String.format("R$ %.2f", valorSemFormatacao);
        System.out.printf("Valor formatado: %s", valorFormatado);
    }
}
