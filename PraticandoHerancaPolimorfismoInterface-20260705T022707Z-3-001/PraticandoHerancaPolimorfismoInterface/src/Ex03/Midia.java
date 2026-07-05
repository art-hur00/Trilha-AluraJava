package Ex03;

abstract class Midia {
    protected String titulo;
    protected int anoDePlubicacao;

    public Midia(String titulo, int anoDePlubicacao){
        this.titulo = titulo;
        this.anoDePlubicacao = anoDePlubicacao;
    }

    public String gerarCodigo() {
        return "LIB-" + titulo.substring(0, 3) + anoDePlubicacao;
    }

}
