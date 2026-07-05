package Ex03;

public class Livro extends Midia{
    private String autor;

    public Livro(String titulo, int anoDePlubicacao, String autor) {
        super(titulo, anoDePlubicacao);
        this.autor = autor;
    }
    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | Livro: \"" + titulo + "\" - Autor: " + autor);
    }
}
