import java.util.*;

public class Indexer {

    public static Map<String, Map<String, Integer>> buildIndex(Map<String, String> files) {

        Map<String, Map<String, Integer>> index = new HashMap<>();

        for (String fileName : files.keySet()) {

            String[] words = files.get(fileName).split("\\W+");

            for (String word : words) {

                if (word.isEmpty()) continue;

                index.putIfAbsent(word, new HashMap<>());

                Map<String, Integer> fileMap = index.get(word);

                fileMap.put(fileName, fileMap.getOrDefault(fileName, 0) + 1);
            }
        }

        return index;
    }
}
