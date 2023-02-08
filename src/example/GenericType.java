package example;

public class GenericType<T>{
    // поле какого-то типа.
    private T t;

    //Конструктор класса берет переменную какого-то типа и присваивает его полю класса
    public GenericType(T t) {
        this.t = t;
    }

    // Возвращает значение какого-то типа
    public T get() {
        //System.out.println(t);
        return t;
    }
    // Берет значение какого-то типа и присваивает его полю, а потом позвращает его
    public T set(T t) {
        this.t = t;
        return this.t;
    }
}
