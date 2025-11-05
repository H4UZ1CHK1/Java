import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class Task2Input {
    public static void run() {
        String fileName = "C://Users//naval//IdeaProjects//Lab11/temps.txt";
        Random random = new Random();

        double minTemp = -20.0;
        double maxTemp = 35.0;

        try (BufferedWriter w = Files.newBufferedWriter(Path.of(fileName))) {
            System.out.println("Сгенерированные температуры:");
            for (int i = 1; i <= 15; i++) {
                double value = minTemp + (maxTemp - minTemp) * random.nextDouble();
                value = Math.round(value * 10.0) / 10.0;
                System.out.printf("%2d) %.1f°C%n", i, value);
                w.write(Double.toString(value));
                w.newLine();
            }
            System.out.println("\nФайл '" + fileName + "' успешно создан.");
        } catch (IOException e) {
            System.out.println("Ошибка работы с файлом: " + e.getMessage());
        }
    }
}
