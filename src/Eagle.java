public class Eagle extends Bird {
    public Eagle(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println(name + " парит высоко в небе, расправив крылья.");
    }
}

