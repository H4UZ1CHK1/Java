import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Task3 {
    public static void run() {
        String fileName = "C://Users//naval//IdeaProjects//Lab11/names.txt";
        String resultFile = "C://Users//naval//IdeaProjects//Lab11/duplicates.txt";

        List<String> names = new ArrayList<>();

        try {
            Path p = Path.of(fileName);
            if (Files.exists(p) && Files.size(p) > 0) {
                try (BufferedReader r = Files.newBufferedReader(p)) {
                    String s;
                    while ((s = r.readLine()) != null) {
                        s = s.trim();
                        if (!s.isEmpty()) names.add(s);
                    }
                }
                System.out.println("Считано имён из существующего файла: " + names.size());
            } else {
                try (Scanner sc = new Scanner(System.in)) {
                    System.out.println("Введите имена (по одному в строке). Пустая строка — завершить ввод:");
                    while (true) {
                        String s = sc.nextLine().trim();
                        if (s.isEmpty()) break;
                        names.add(s);
                    }
                }
                try (BufferedWriter w = Files.newBufferedWriter(p)) {
                    for (String n : names) {
                        w.write(n);
                        w.newLine();
                    }
                }
                System.out.println("Файл '" + fileName + "' создан. Записано имён: " + names.size());
            }

            Set<String> seen = new HashSet<>();
            Set<String> dups = new LinkedHashSet<>();
            for (String n : names) if (!seen.add(n)) dups.add(n);

            try (BufferedWriter w = Files.newBufferedWriter(Path.of(resultFile))) {
                if (dups.isEmpty()) {
                    w.write("Дубликатов не найдено.");
                    System.out.println("Дубликатов не найдено.");
                } else {
                    w.write("Найдены дубликаты:\n");
                    for (String d : dups) {
                        w.write(d);
                        w.newLine();
                    }
                    System.out.println("Найдены дубликаты: " + dups);
                }
            }

            System.out.println("Результат записан в '" + resultFile + "'.");
        } catch (IOException e) {
            System.out.println("Ошибка файлового ввода-вывода: " + e.getMessage());
        }
    }
}
