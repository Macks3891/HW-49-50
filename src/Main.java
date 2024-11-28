import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {


    public static void countCharacterOccurrences(String input) {

        input = input.replaceAll(" ", "");


        HashMap<Character, Integer> charCountMap = new HashMap<>();


        for (char c : input.toCharArray()) {

            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {

                charCountMap.put(c, 1);
            }
        }


        for (Character c : charCountMap.keySet()) {
            System.out.println("Символ '" + c + "' встречается " + charCountMap.get(c) + " раз(а)");
        }
    }


    public static boolean hasUniqueLetters(String input) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();


        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }


        for (int count : charCountMap.values()) {
            if (count == 1) {
                return true;
            }
        }

        return false;
    }


    public static double averageCharacterCount(String input) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();


        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }


        int totalCharacters = input.length();
        int uniqueCharacters = charCountMap.size();


        return (double) totalCharacters / uniqueCharacters;
    }


    public static void countWordOccurrences(String input) {

        String cleanedInput = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();


        String[] words = cleanedInput.split("\\s+");


        HashMap<String, Integer> wordCountMap = new HashMap<>();


        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }


        TreeMap<String, Integer> sortedWordCountMap = new TreeMap<>(wordCountMap);


        for (Map.Entry<String, Integer> entry : sortedWordCountMap.entrySet()) {
            System.out.println("Слово '" + entry.getKey() + "' встречается " + entry.getValue() + " раз(а)");
        }
    }

    public static void main(String[] args) {
        String input = "!!! Java is Fun and java IS powerful !!!";


        System.out.println("Подсчет количества вхождений каждого символа:");
        countCharacterOccurrences(input);


        boolean hasUnique = hasUniqueLetters(input);
        System.out.println("\nЕсть ли уникальные буквы: " + hasUnique);


        double averageCount = averageCharacterCount(input);
        System.out.println("Среднее количество символов: " + averageCount);


        System.out.println("\nПодсчет количества вхождений каждого слова:");
        countWordOccurrences(input);
    }
}