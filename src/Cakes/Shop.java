package Cakes;

public class Shop {
    public static void main(String[] args) {
        Box box = new Box(1);
        System.out.println(box.get());
        box.put(5);
        System.out.println(box.get());

    }
}
