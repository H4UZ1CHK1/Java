import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task2Average {
    public static void run() {
        String fileName = "C://Users//naval//IdeaProjects//Lab11/temps.txt";
        double sum = 0.0;
        int cnt = 0;

        try (BufferedReader r = Files.newBufferedReader(Path.of(fileName))) {
            String line;
            while ((line = r.readLine()) != null) {
                line = line.trim().replace(',', '.');
                if (line.isEmpty()) continue;
                double v = Double.parseDouble(line);
                sum += v;
                cnt++;
            }
            if (cnt == 0) {
                System.out.println("Файл пуст или не содержит корректных значений.");
            } else {
                double avg = sum / cnt;
                System.out.printf("Прочитано значений: %d%nСредняя температура: %.3f%n", cnt, avg);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка формата числа: " + e.getMessage());
        }
    }
}
