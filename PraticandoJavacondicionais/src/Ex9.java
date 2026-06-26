import java.util.Scanner;
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade do doador: ");
        int idade = sc.nextInt();
        System.out.println("Digite o peso do doador: ");
        double peso = sc.nextInt();
        sc.close();
        if(idade >= 18 && idade <= 65 && peso > 55)
            System.out.println("O doador é compatível");
        else if(peso < 55)
            System.out.println("O doador não é compatível.\nMotivo: Peso a baixo do minimo (55kg)");
        else
            System.out.println("O doador não é compatível\nMotivo:  Deve ter entre 18 e 65 anos.");
    }

