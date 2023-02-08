package Cakes;

class Box<T> {
    T t;
    public Box(T t) {
        this.t = t;
    }
    public T put(T t) {
        this.t = t;
        return this.t;
    }
    public T get() {
        return this.t = t;
    }

}