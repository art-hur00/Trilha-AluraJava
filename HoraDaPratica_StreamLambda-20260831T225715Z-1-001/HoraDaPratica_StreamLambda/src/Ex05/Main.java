package Ex05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    static void main(String[] args) {
        List<List<Integer>> listaDeNumeros = Arrays.asList(Arrays.asList(1,2,3,4), Arrays.asList(5,6,7,8), Arrays.asList(9,10,11,12));

        List<Integer> novaLista = listaDeNumeros.stream().flatMap(List::stream).collect(Collectors.toList());
        novaLista.stream().filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0)).sorted().forEach(System.out::println);
    }
}
