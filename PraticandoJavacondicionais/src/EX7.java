import java.util.Scanner;

public class EX7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do empréstimo: ");
        double valorEmprestimo = sc.nextDouble();
        sc.close();
        if(valorEmprestimo <= 5000 && valorEmprestimo >= 1000){
            System.out.println("O valor" + valorEmprestimo + " está dentro do intervalo permitido para empréstimo.");
        }else{
            System.out.println("O valor " + valorEmprestimo + " não está dentro do intervalo permitido para empréstimo.");
        }
    }
}
