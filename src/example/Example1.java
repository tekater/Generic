package example;

public class Example1 {
    public static void main(String[] args) {
        GenericType a = new GenericType("Hello!");
        System.out.println("a: " + a.get());
        GenericType b = new GenericType(1234);
        System.out.println("b: " + b.get());
        GenericType c = new GenericType(5.9);
        System.out.println("c: " + c.get());

        GenericType<Integer> obj1 = new GenericType<Integer>(10);
        GenericType<String> obj2 = new GenericType<String>("Hello");
        System.out.println(obj1.get());
        System.out.println(obj1.set(20));
        System.out.println(obj1.get());
    }
}
