public class Sparrow implements Bird {
    private String name;

    public Sparrow(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " летает низко и быстро, перебирая крыльями.");
    }
}
