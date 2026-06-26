public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReprodcoes;
    private double classficacao;

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalDeReprodcoes() {
        return totalDeReprodcoes;
    }

    public double getClassficacao() {
        return classficacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setTotalDeReprodcoes(int totalDeReprodcoes) {
        this.totalDeReprodcoes = totalDeReprodcoes;
    }

    public void setClassficacao(double classficacao) {
        this.classficacao = classficacao;
    }
    public void curtir(){
        classficacao++;
        System.out.println("Você curtiu essa música!");
        System.out.println("Total de curtidas: " + classficacao);
    }
    public void reproduzir(){
        totalDeReprodcoes++;
        System.out.println("Reproduzindo a música!");
        System.out.println("Total de reproduções: "+ totalDeReprodcoes);
    }
}
