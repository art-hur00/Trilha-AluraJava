package Ex03;

public class Ebook extends Midia{
    private String formato;

    public Ebook(String titulo, int anoDePlubicacao, String formato){
        super(titulo, anoDePlubicacao);
        this.formato = formato;
    }
    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | Ebook: \"" + titulo + "\" - Formato: " + formato);
    }

}
