package Ex01;

public class Aluno {
    private String nome;
    private String tipo;

    public Aluno(String nome, String tipo){
        this.tipo = tipo;
        this.nome = nome;
    }
    public void identificar(){
        System.out.println("Aluno: "+" - Tipo: " + tipo);
    }
}
