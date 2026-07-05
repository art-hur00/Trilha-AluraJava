package Ex03;

public class Revista extends Midia{
    private int edicao;

    public Revista(String titulo, int anoDePlubicacao, int edicao){
        super(titulo, anoDePlubicacao);
        this.edicao = edicao;
    }
    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | Livro: \"" + titulo + "\" - Autor: " + edicao);
    }
}
