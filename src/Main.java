import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите задание:");
            System.out.println("1 — Задание 1 ");
            System.out.println("2 — Задание 2 ");
            System.out.println("3 — Задание 3 ");
            System.out.println("0 — Выход");

            String input = sc.nextLine().trim();
            switch (input) {
                case "1": ex1.run();
                break;
                case "2": ex2.run();
                break;
                case "3": ex3.run();
                break;
                case "0": System.out.println("Выход из программы."); return;
                default: System.out.println("Некорректный выбор.\n");
            }
        }
    }
}
