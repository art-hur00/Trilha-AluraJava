import java.util.ArrayList;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Ex8Aluno> lista = new ArrayList<>();

        while(true){
            Ex8Aluno aluno = new Ex8Aluno();

            System.out.println("Digite o nome do aluno: ");
            aluno.setNome(sc.nextLine());

            System.out.println("Digite sua nota A1: ");
            aluno.setNotaA1(sc.nextDouble());

            System.out.println("Digite sua nota A2: ");
            aluno.setNotaA2(sc.nextDouble());

            System.out.println("Digite sua nota A3: ");
            aluno.setNotaA3(sc.nextDouble());

            aluno.setMediaFinal(aluno.calculaMedia(aluno.getNotaA1(), aluno.getNotaA2(), aluno.getNotaA3()));

            System.out.println("Deseja Continuar? \nSim - 1\nNão - 2");
            int decisao = sc.nextInt();
            sc.nextLine();
            if (decisao == 2){
                break;
            }

            if(aluno.getMediaFinal() >= 7){
                aluno.setAprovado(true);
            }else{
                aluno.setAprovado(false);
            }

            lista.add(aluno);
        }
        System.out.println(lista);
    }
}
