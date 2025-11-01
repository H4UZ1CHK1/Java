import java.util.*;

public class ex1 {
    static class Language {
        private String name;
        public Language(String name) { this.name = name; }
        public String getName() { return name; }

        @Override
        public String toString(){
            return name;
        }
    }

    static class Spanish extends Language {
        public Spanish() {
            super("Spanish"); }
    }
    static class German  extends Language {
        public German()  {
            super("German");  }
    }
    public static void run() {
        Map<String, Language> languages = new HashMap<>();
        languages.put("Spanish", new Spanish());
        languages.put("German",  new German());

        System.out.println("Ключи отображения языков:");
        for (String key : languages.keySet()) {
            System.out.println(key);
        }
        System.out.println();

        for (Language values : languages.values()) {
            System.out.println(values);
        }
        System.out.println();
    }
}
