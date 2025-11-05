import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {
    public static void run() {
        File dir  = new File("files");
        File file = new File(dir, "about_me.txt");
        String content = """
                Имя: Джон Мисайд
                Специальность: Страж Гипербореи
                Хобби: Потребление белого монстра
                """;

        try {
            if (!dir.exists()) dir.mkdirs();

            try (Writer w = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file), StandardCharsets.UTF_8))) {
                w.write(content);
            }
            System.out.println("Файл создан: " + file.getAbsolutePath());

            System.out.println("\n=== Сведения о файле ===");
            System.out.println("Имя: " + file.getName());
            System.out.println("Абс. путь: " + file.getAbsolutePath());
            System.out.println("Размер: " + file.length() + " байт");
            System.out.println("Изменён: " +
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));
            System.out.println("Права: read=" + file.canRead() + ", write=" + file.canWrite() + ", exec=" + file.canExecute());

            System.out.println("\n=== Содержимое ===");
            try (BufferedReader r = new BufferedReader(new InputStreamReader(
                    new FileInputStream(file), StandardCharsets.UTF_8))) {
                String line;
                while ((line = r.readLine()) != null) System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
