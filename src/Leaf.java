class Leaf {
    private String color;

    public Leaf(String color) {
        this.color = color;
    }

    public void fall() {
        System.out.println("Лист упал.");
        color = "коричневый";
    }

    public void bloom() {
        System.out.println("Лист расцветает.");
        color = "Зеленый";
    }

    public void freeze() {
        System.out.println("Лист покрылся инеем.");
        color = "Белый";
    }

    public String getColor() {
        return color;
    }
}
