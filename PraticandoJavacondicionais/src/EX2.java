import java.util.Scanner;

public class EX2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual foi a media do aluno? ");
        double media = sc.nextDouble();

        if(media >= 7){
            System.out.println("O estudante teve média "+  media + " e foi aprovado.");
        }else if(media >= 5){
            System.out.println("O estudante teve média "+  media + " e está de recuperação.");
        }else
            System.out.println("O aluno se fodeukkkkkk");
    }
}
