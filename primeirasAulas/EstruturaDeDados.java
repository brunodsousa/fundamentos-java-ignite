package primeirasAulas;

import java.util.ArrayList;
import java.util.List;
// O import precisa vir, obrigatoriamente, antes da declaração de classes

public class EstruturaDeDados {
    public static void main(String[] args) {
        // Lista
        List<String> nomes = new ArrayList<>();

        nomes.add("Bruno");
        nomes.add("Taiãma");
        nomes.add("Serrinha");

        System.out.println(nomes.get(0));

        for (String nome : nomes) {
            System.out.println("O nome que apareceu foi " + nome);
        }

        nomes.forEach(nome -> System.out.println("Nome: " + nome));

        nomes.forEach(System.out::println);
        System.out.println(nomes.size()); // 3
        System.out.println(nomes.isEmpty()); // false
        System.out.println(nomes.contains("Bruno")); // true
    }
}
