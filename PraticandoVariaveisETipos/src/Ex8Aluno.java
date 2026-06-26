public class Ex8Aluno {
    private String nome;
    private double notaA1;
    private double notaA2;
    private double notaA3;
    private double mediaFinal;
    private boolean aprovado;

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaA1() {
        return notaA1;
    }

    public void setNotaA1(double notaA1) {
        this.notaA1 = notaA1;
    }

    public double getNotaA2() {
        return notaA2;
    }

    public void setNotaA2(double notaA2) {
        this.notaA2 = notaA2;
    }

    public double getNotaA3() {
        return notaA3;
    }

    public void setNotaA3(double notaA3) {
        this.notaA3 = notaA3;
    }

    public double calculaMedia(double notaA1, double notaA2, double notaA3){
        return (notaA1 + notaA2 + notaA3) / 3;

    }

    @Override
    public String toString() {
        return "\nAluno{" +
                "\nnome =" + nome + '\'' +
                ", \nnota A1 = " + notaA1 +
                ", \nnota A2 = " + notaA2 +
                ", \nnota A3 = " + notaA3 +
                ", \nMédia final = " + mediaFinal  +
                ", \nAprovado: " + aprovado  +
                "\n}";
    }
}
