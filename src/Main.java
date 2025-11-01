public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow("Воробей");
        Bird eagle = new Eagle("Орёл");
        Sparrow spar = new Sparrow("авав");

        sparrow.fly();
        eagle.fly();
    }
}
