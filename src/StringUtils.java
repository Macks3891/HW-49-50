import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StringUtils {

    // Метод для подсчета количества вхождений каждого символа
    public static void countCharacterOccurrences(String input) {
        // Удаляем пробелы из строки
        input = input.replaceAll(" ", "");

        // Создаем HashMap для подсчета вхождений символов
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Проходим по каждому символу в строке
        for (char c : input.toCharArray()) {
            // Если символ уже есть в HashMap, увеличиваем его значение на 1
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // Если символа нет в HashMap, добавляем его с начальным значением 1
                charCountMap.put(c, 1);
            }
        }

        // Выводим результат
        for (Character c : charCountMap.keySet()) {
            System.out.println("Символ '" + c + "' встречается " + charCountMap.get(c) + " раз(а)");
        }
    }

    // Метод для проверки наличия уникальных букв
    public static boolean hasUniqueLetters(String input) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Подсчитываем количество вхождений каждого символа
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Проверяем, есть ли символы, которые встречаются только один раз
        for (int count : charCountMap.values()) {
            if (count == 1) {
                return true;
            }
        }

        return false;
    }

    // Метод для подсчета среднего количества символов
    public static double averageCharacterCount(String input) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Подсчитываем количество вхождений каждого символа
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Считаем общее количество символов и количество уникальных символов
        int totalCharacters = input.length();
        int uniqueCharacters = charCountMap.size();

        // Возвращаем среднее количество символов
        return (double) totalCharacters / uniqueCharacters;
    }

    // Метод для подсчета количества вхождений каждого слова
    public static void countWordOccurrences(String input) {
        // Очищаем строку от лишних символов и приводим к нижнему регистру
        String cleanedInput = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Разбиваем строку на слова
        String[] words = cleanedInput.split("\\s+");

        // Создаем HashMap для подсчета вхождений слов
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Подсчитываем количество вхождений каждого слова
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Создаем TreeMap для сортировки слов по алфавиту
        TreeMap<String, Integer> sortedWordCountMap = new TreeMap<>(wordCountMap);

        // Выводим результат
        for (Map.Entry<String, Integer> entry : sortedWordCountMap.entrySet()) {
            System.out.println("Слово '" + entry.getKey() + "' встречается " + entry.getValue() + " раз(а)");
        }
    }
}