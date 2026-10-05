package Ex02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java","stream","lambda");
        palavras.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
