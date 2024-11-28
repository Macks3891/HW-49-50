import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String input = "java is fun and java is powerful";


        System.out.println("Подсчет количества вхождений каждого символа:");
        StringUtils.countCharacterOccurrences(input);


        boolean hasUnique = StringUtils.hasUniqueLetters(input);
        System.out.println("\nЕсть ли уникальные буквы: " + hasUnique);


        double averageCount = StringUtils.averageCharacterCount(input);
        System.out.println("Среднее количество символов: " + averageCount);


        String wordInput = "!!! Java is Fun and java IS powerful !!!";
        System.out.println("\nПодсчет количества вхождений каждого слова:");
        StringUtils.countWordOccurrences(wordInput);


        Map<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "C");
        originalMap.put(2, "B");
        originalMap.put(3, "A");


        Map<String, Integer> invertedMap = MapUtils.invertMap(originalMap);


        System.out.println("\nРезультат инверсии мапы:");
        for (Map.Entry<String, Integer> entry : invertedMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }


        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));


        people.sort(new NameComparator());
        System.out.println("\nСортировка по имени:");
        for (Person person : people) {
            System.out.println(person);
        }


        people.sort(new AgeComparator());
        System.out.println("\nСортировка по возрасту:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}