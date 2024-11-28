import java.util.HashMap;
import java.util.Map;

public class MapUtils {

    // Метод для инверсии ключей и значений в мапе
    public static <K, V> Map<V, K> invertMap(Map<K, V> originalMap) {
        Map<V, K> invertedMap = new HashMap<>();

        // Проходим по всем парам ключ-значение в исходной мапе
        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            // Добавляем значение исходной мапы как ключ и ключ исходной мапы как значение
            invertedMap.put(entry.getValue(), entry.getKey());
        }

        return invertedMap;
    }
}