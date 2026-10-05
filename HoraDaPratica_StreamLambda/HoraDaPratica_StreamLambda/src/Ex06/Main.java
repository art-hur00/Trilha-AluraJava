package Ex06;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(new Pessoa("Alice", 22), new Pessoa("Bob", 17), new Pessoa("Charlie", 19));

        pessoas.stream().filter(p -> p.idade > 18).map(p -> p.nome).sorted().forEach(System.out::println);

    }
}
