import java.util.*;

public class ex2 {
    static class Student {
        private String name;
        private String group;
        private int course;
        private final Map<String, Integer> grades;

        public Student(String name, String group, int course, Map<String, Integer> grades) {
            this.name = name;
            this.group = group;
            this.course = course;
            this.grades = new HashMap<>(grades);
        }

        public String getName() {
            return name;
        }
        public int getCourse() {
            return course;
        }

        public double average() {
            if (grades.isEmpty()) return 0.0;
            int sum = 0;
            for (int v : grades.values()) sum += v;
            return sum * 1.0 / grades.size();
        }

        public void promote() {
            course++;
        }
    }

    public static void promoteOrExpel(List<Student> students) {
        for (int i = students.size() - 1; i >= 0; i--) {
            Student s = students.get(i);
            if (s.average() < 3.0) {
                students.remove(i);
            } else {
                s.promote();
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student s : students) {
            if (s.getCourse() == course)
                System.out.println(s.getName());
        }
    }

    public static void run() {
        List<Student> students = new ArrayList<>();

        Map<String, Integer> g1 = Map.of("Math", 4, "CS", 5, "Eng", 3);
        Map<String, Integer> g2 = Map.of("Math", 2, "CS", 2, "Eng", 3);
        Map<String, Integer> g3 = Map.of("Math", 3, "CS", 3, "Eng", 4);

        students.add(new Student("Alex", "P-31", 1, g1));
        students.add(new Student("Maria", "P-31", 1, g2));
        students.add(new Student("Ivan", "P-41", 1, g3));

        System.out.println("До обработки:");
        System.out.print("Курс 1: "); printStudents(students, 1);
        System.out.print("Курс 2: "); printStudents(students, 2);

        promoteOrExpel(students);

        System.out.println("\nПосле обработки:");
        System.out.print("Курс 2: "); printStudents(students, 2);
        System.out.print("Курс 3: "); printStudents(students, 3);
        System.out.println();
    }
}
