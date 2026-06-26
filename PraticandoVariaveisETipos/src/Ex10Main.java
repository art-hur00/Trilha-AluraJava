import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Ex10Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Ex10Livro> lista = new ArrayList<>();

        int i = 1;

        while (true) {

            System.out.println("Cadastrando "+ i +"° livro.");
            Ex10Livro livro = new Ex10Livro();

            System.out.println("Digite o Título do livro: ");
            livro.setTitulo(sc.nextLine());

            System.out.println("Digite o Autor do livro: ");
            livro.setAutor(sc.nextLine());

            System.out.println("Digite o número de páginas do livro: ");
            livro.setNumeroPaginas(sc.nextInt());
            sc.nextLine();

            System.out.println("Digite o preço do livro: ");
            livro.setPrecoLivro(sc.nextDouble());
            sc.nextLine();

            System.out.println("Digite a categoria do livro:" +
                    "\n F - Ficção" +
                    "\n N - Não-ficção" +
                    "\n T - Tecnologia" +
                    "\n H - História");

            livro.setCategoria(sc.nextLine());
            livro.setCategoria(livro.getCategoria().toUpperCase());
            while(true) {
                if (Objects.equals(livro.getCategoria(), "F")) {
                    livro.setCategoria("Ficção");
                    break;
                } else if (Objects.equals(livro.getCategoria(), "N")) {
                    livro.setCategoria("Não-ficção");
                    break;
                } else if (Objects.equals(livro.getCategoria(), "T")) {
                    livro.setCategoria("Tecnologia");
                    break;
                } else if (Objects.equals(livro.getCategoria(), "H")) {
                    livro.setCategoria("História");
                    break;
                } else {
                    System.out.println("Opção inválida!\nTente Novamente");
                    livro.setCategoria(sc.nextLine().toUpperCase());
                }
            }

            lista.add(livro);
            livro.imprimeLivro();
            System.out.println("Deseja continuar? \n 1 - Não 2 - Sim");
            int continuaLaco = sc.nextInt();

            if (continuaLaco == 1){
                break;
            }
            sc.nextLine();
            i++;
        }

        FileWriter escrita = new FileWriter("Lista de livros.txt", true);
        escrita.write(String.valueOf(lista));
        escrita.close();
    }
}