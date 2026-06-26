import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ex9Temperatura temp = new Ex9Temperatura();

        System.out.println("Digite a temperatura: (Ex:C°) ");
        temp.setTempEmC(sc.nextInt());

        temp.setTempEmFahr(temp.converte(temp.getTempEmC()));
        System.out.println("A temperatura em graus Fahrenheit é: "+temp.getTempEmFahr());
    }
}
