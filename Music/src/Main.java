import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Audio primeiraMusica = new Audio();
        int escolhaMenu = 0;
        System.out.println("Olá bem vindo ao Music!");
        while (escolhaMenu != 4) {
            System.out.println("O que deseja fazer?\n1-Adicionar Música | 2- Curtir Música | 3 - Reproduzir as músicas | 4 - sair");
            escolhaMenu = sc.nextInt();
            if (escolhaMenu == 1) {
                System.out.println("Ok, primeiro qual o nome da música?");
                sc.nextLine();
                String nomeMusica = sc.nextLine();
                primeiraMusica.setTitulo(nomeMusica);
                System.out.println("Qual é o tempo de duração?");
                int respostaTempoDeDuracao = sc.nextInt();
               primeiraMusica.setDuracao(respostaTempoDeDuracao);
            }else if(escolhaMenu == 2){
                primeiraMusica.curtir();
            }else if(escolhaMenu == 3){
                primeiraMusica.reproduzir();
            }else if (escolhaMenu == 4){
                System.out.println("Adeus!");
            }else{
                System.out.println("Opção inválida!");
            }
        }
    }
}