import java.util.Scanner;

public class Ex15 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o consumo médio do veículo : ");
        double consumoMedio = sc.nextDouble();
        System.out.println("Digite a capacidade máxima do tanque do veiculo: ");
        double capacidadeTanque = sc.nextDouble();
        System.out.println("Digite a quantidade de combústivel presento no momento: ");
        double quantidadeCombustivelDisponivel = sc.nextDouble();
        System.out.println("Digite a distancia da viagem : ");
        double distanciaViagemPlanejada = sc.nextDouble();

        double calculaAutonomiaMaxima =  consumoMedio * capacidadeTanque;
        double calculaAutonomiaAtual = quantidadeCombustivelDisponivel * consumoMedio;
        boolean combustivelSuficiente = calculaAutonomiaAtual > distanciaViagemPlanejada;

        System.out.println("Autonomia máxima do veículo: "+ calculaAutonomiaMaxima +" km");
        System.out.println("Autonomia atual :" + calculaAutonomiaAtual + " km");
        if(combustivelSuficiente)
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        else
            System.out.println("Você não conseguirá completar a viagem sem precisar abastecer. ");
    }
}
