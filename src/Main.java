public class Main {
    public static void main(String[] args) {
        //1
        Gekkon gekkon = new Gekkon("Ранго", 3);
        System.out.println("Имя геккона: " + gekkon.getName());
        System.out.println("Возраст геккона: " + gekkon.getAge());
        gekkon.eat();
        gekkon.sleep();

        //2
        Tree tree = new Tree("Голое", "Зеленый");

        tree.showState();

        tree.bloom();
        tree.showState();

        tree.fallLeaves();
        tree.showState();

        tree.coverWithFrost();
        tree.showState();
    }
}
