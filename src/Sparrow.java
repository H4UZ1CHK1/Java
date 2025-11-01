public class Sparrow extends Bird {
    public Sparrow(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println(name + " летает низко и быстро, перебирая крыльями.");
    }
}
