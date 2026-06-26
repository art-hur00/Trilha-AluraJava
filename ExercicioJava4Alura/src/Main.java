import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Veiculo carro1 = new Veiculo();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter("Carro.json");


        System.out.println("Digite a cor do seu carro: ");
        carro1.setCor(sc.nextLine());
        System.out.println("Digite o ano do seu carro: ");
        carro1.setAno(sc.nextInt());
        sc.nextLine();
        System.out.println("Digite o modelo do seu carro: ");
        carro1.setModelo(sc.nextLine());
        System.out.println("Digite a litragem do seu carro: ");
        carro1.setLitragem(sc.nextDouble());

        sc.close();
        try {
            escrita.write(gson.toJson(carro1));
            escrita.close();
            System.out.println("Escrita Completa!");
        }catch (Exception e){
            System.out.println("ATENÇÃO! ERRO!");
        }
    }
}
//Defina uma classe chamada Veiculo com os atributos necessários.
// Em seguida, crie um programa que instancia um objeto Veiculo, serializa esse objeto para JSON usando a biblioteca Gson
// e imprime o resultado.