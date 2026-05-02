import java.util.*;

public class SearchEngine {

    public static void search(String keyword, Map<String, Map<String, Integer>> index) {

        keyword = keyword.toLowerCase();

        if (!index.containsKey(keyword)) {
            System.out.println("No results found.");
            return;
        }

        Map<String, Integer> results = index.get(keyword);

        results.entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .forEach(entry ->
                        System.out.println(entry.getKey() + " (score: " + entry.getValue() + ")"));
    }
}
