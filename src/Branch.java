class Branch {
    private String state;

    public Branch(String state) {
        this.state = state;
    }

    public void bloom() {
        System.out.println("Ветка цветет.");
        state = "Цветет";
    }

    public void freeze() {
        System.out.println("Ветка замерзает.");
        state = "Леденеет";
    }

    public String getState() {
        return state;
    }
}
