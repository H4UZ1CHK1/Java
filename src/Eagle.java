public class Eagle implements Bird {
    private String name;

    public Eagle(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " парит высоко в небе, расправив крылья.");
    }
}
