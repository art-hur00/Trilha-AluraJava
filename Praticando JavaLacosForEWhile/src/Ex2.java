public class Ex2 {
    static void main() {
        int[] valores = {10, 20, 30, 40, 50};
        int soma = 0;

        for(int valor : valores){
            soma += valor;
        }
        System.out.println(soma);
    }
}
