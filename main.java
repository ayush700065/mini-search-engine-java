import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        String folderPath = "data";

        Map<String, String> files = FileLoader.loadFiles(folderPath);

        Map<String, Map<String, Integer>> index = Indexer.buildIndex(files);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter search word (or 'exit'): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) break;

            SearchEngine.search(input, index);
        }

        scanner.close();
    }
}
