import java.util.HashSet;
import java.util.Set;

public class ColecaoHashSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        numeros.add(10);
        numeros.add(9);
        numeros.add(8);
        numeros.add(7);

        numeros.remove(10);

        System.out.println(numeros.size()); // 4

        for (Integer elemento : numeros) {
            System.out.println(elemento);
        }

        System.out.println(numeros.contains(9)); // true
        System.out.println(numeros.contains(10)); // false
    }
}
