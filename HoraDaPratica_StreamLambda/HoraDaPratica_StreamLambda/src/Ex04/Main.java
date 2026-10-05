package Ex04;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        palavras.stream().distinct().forEach(System.out::println);
    }
}
