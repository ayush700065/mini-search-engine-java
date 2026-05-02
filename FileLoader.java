import java.io.*;
import java.util.*;

public class FileLoader {

    public static Map<String, String> loadFiles(String folderPath) throws IOException {

        Map<String, String> fileData = new HashMap<>();

        File folder = new File(folderPath);

        if (!folder.exists() || folder.listFiles() == null) {
            throw new RuntimeException("Folder not found or empty!");
        }

        for (File file : folder.listFiles()) {
            if (file.isFile()) {

                BufferedReader br = new BufferedReader(new FileReader(file));
                StringBuilder content = new StringBuilder();
                String line;

                while ((line = br.readLine()) != null) {
                    content.append(line).append(" ");
                }

                br.close();

                fileData.put(file.getName(), content.toString().toLowerCase());
            }
        }

        return fileData;
    }
}
