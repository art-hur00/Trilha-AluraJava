import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cartao cartao1 = new Cartao();
        Scanner sc = new Scanner(System.in);
        ArrayList<Compra> listaDeCompras = new ArrayList<>();

        System.out.println("Digite o limite do cartão: ");
        cartao1.setLimiteDoCartao(sc.nextDouble());

        int decisao = 2;
        while (decisao != 0 ) {
            Compra compras = new Compra();
            sc.nextLine();

            System.out.println("Digite a descrição da compra: ");
            compras.setDescricaoDaCompra(sc.nextLine());

            System.out.println("Digite o valor da compra: ");
            compras.setValorDaCompra(sc.nextDouble());

            if (cartao1.realizarCompra(compras)){
                listaDeCompras.add(compras);
                System.out.println("Compra realizada");
            }else{
                break;
            }
            System.out.println("Digite 0 para sair, ou qualquer número para continuar: ");
            decisao = sc.nextInt();
        }
        System.out.println("********************");
        System.out.println("\nCompras Realizadas\n");
        for(Compra compra : listaDeCompras){
            System.out.println(compra.getDescricaoDaCompra() + " - " + compra.getValorDaCompra());
        }
        System.out.println("********************");

    }
}