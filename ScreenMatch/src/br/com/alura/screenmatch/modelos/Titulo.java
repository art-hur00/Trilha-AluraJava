package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;

    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome= meuTituloOmdb.title();
        if(meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano " +
                    "porque tem mais de 04 caracteres.");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public int getTotalDeAvaliações(){
        return totalDeAvaliacoes;
    }
    public void setincluidoNoPlano(boolean  incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public void setAnodeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }



    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme = " + nome);
        System.out.println("Ano de lançamento = " + anoDeLancamento);
        System.out.println("Duração em minutos: "+duracaoEmMinutos);
        System.out.println("Incluído no plano: "+incluidoNoPlano);
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDelancamento(){
        return anoDeLancamento;
    }
    public String getNome(){
        return nome;
    }
    public boolean isIncluidoNoPlano(){
        return incluidoNoPlano;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "(nome = " + nome + "," +
                "anoDeLancamento = " + anoDeLancamento + "," +
                "duração = "+  duracaoEmMinutos + ")";
    }
}
