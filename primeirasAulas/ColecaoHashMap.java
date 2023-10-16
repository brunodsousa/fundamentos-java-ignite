package primeirasAulas;

import java.util.HashMap;
import java.util.Map;

public class ColecaoHashMap {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();

        notas.put("Bruno", 7);
        notas.put("Taiãma", 10);
        notas.put("Didi", 10);
        // O HashMap trabalha com chaves únicas; no caso de inserção de uma chave
        // repetida, apenas a última será considerada

        Integer nota = notas.get("Bruno"); // 7
        System.out.println(nota);

        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("A chave é " + key + " e o valor é " + value);
        }
    }
}
