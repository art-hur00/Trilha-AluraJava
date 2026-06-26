import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("Quantos tipos de itens diferentes serão registrados? ");
        int itensParaRegistros = sc.nextInt();

        for(int i = 1;i <= itensParaRegistros; i++ ){
        System.out.println("Quantas unidades tem do "+ i +"° produtos? ");
        double itensEmDouble = sc.nextDouble();
        int itensEmInt = (int)itensEmDouble;
        lista.add(itensEmInt);
        }

        sc.close();
        System.out.println(lista);
    }
}
