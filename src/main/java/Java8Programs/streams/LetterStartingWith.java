package Java8Programs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LetterStartingWith
{
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "apricot", "banana", "blueberry", "appliance", "berry");

        // Group words by their first two letters
        Map<String, List<String>> groupedWords = words.stream()
                .filter(word -> word.length() >= 2)
                .collect(Collectors.groupingBy(word -> word.substring(0, 2)));

        // Filter out groups that have more than one word (common first two letters)
        Map<String, List<String>> commonWords = groupedWords.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // Display the result
        commonWords.forEach((key, value) ->
                System.out.println("Words with common first two letters '" + key + "': " + value));
    }
}
