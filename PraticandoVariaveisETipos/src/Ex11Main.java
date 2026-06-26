import java.util.Scanner;

public class Ex11Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o preço do produto: ");
        double preco = sc.nextInt();

        if(preco <= 50){
            System.out.println("Categoria do produto: Econômico");
        }else if(preco <= 200){
            System.out.println("Categoria do produto: Intermediário");
        }else{
            System.out.println("Premium");
        }
    }
}
