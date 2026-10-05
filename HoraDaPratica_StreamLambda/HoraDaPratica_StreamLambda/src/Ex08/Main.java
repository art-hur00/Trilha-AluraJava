package Ex08;

import Ex07.Produto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(new Produto("SmartPhone", 800, "Eletrônicos"),
                new Produto("Notebook", 1500, "Eletrônicos"),
                new Produto("Teclado", 200, "Eletrônicos"),
                new Produto("Cadeira", 300, "Móveis"),
                new Produto("Monitor", 900, "Eletrônicos"),
                new Produto("Mesa", 700, "Móveis"));

        List<Produto> novaLista = produtos.stream().filter(p -> p.getCategoria().equals("Eletrônicos")).sorted(Comparator.comparing(Produto::getPreco)).limit(3).collect(Collectors.toList());
        novaLista.stream().forEach(System.out::println);

    }
}
