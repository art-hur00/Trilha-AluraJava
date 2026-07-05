package Ex05;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();
        System.out.print("Digite a palavra: ");
        String palavra = scanner.nextLine();

        if(texto.contains(palavra)){
            System.out.printf("A palavra '%s' esta presente no texto.", palavra);
        }else{
            System.out.printf("A palavra '%s' nao esta presente no texto.", palavra);
        }
        scanner.close();
    }
}
