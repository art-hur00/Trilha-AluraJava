public class Ex10Livro {

    private String titulo;
    private String autor;
    private int numeroPaginas;
    private double precoLivro;
    private String categoria;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public double getPrecoLivro() {
        return precoLivro;
    }

    public void setPrecoLivro(double precoLivro) {
        this.precoLivro = precoLivro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void imprimeLivro() {
        System.out.println("Livro cadastrado: " + titulo + " de " + autor + ". Ele possui " + numeroPaginas + " páginas, custa R$ " + precoLivro + " e pertence à categoria " + categoria+".");
    }
    @Override
    public String toString() {
        return "{\nTítulo: " + titulo +
                "\nAutor: " + autor +
                "\nPáginas: " + numeroPaginas +
                "\nPreço: R$" + precoLivro +
                "\nCategoria: " + categoria +
                "\n}\n";
    }
}
