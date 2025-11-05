import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 — Задание 1: файл с информацией о себе");
        System.out.println("2 — Задание 2a: ввести 15 температур и записать в файл");
        System.out.println("3 — Задание 2b: прочитать температуры из файла и вывести среднюю");
        System.out.println("4 — Задание 3 (вариант 17): дубликаты имён");
        System.out.print("Выбор: ");

        String choice = sc.nextLine().trim();
        switch (choice) {
            case "1" -> Task1.run();
            case "2" -> Task2Input.run();
            case "3" -> Task2Average.run();
            case "4" -> Task3.run();
            default -> System.out.println("Нет такого пункта.");
        }
    }
}
