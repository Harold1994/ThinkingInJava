package Review.Generic;

import java.util.List;

public class Holder<T> {
    private T value;

    public Holder() {}

    public Holder(T value) {
        this.value = value;
    }

    public void set(T value) {
        this.value = value;
    }

    public T get() {return value;}

    public boolean equals(Object object) {
        return value.equals(object);
    }

    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new li());
    }

    public static void main(String[] args) {
        Holder<Apple> Apple = new Holder<Apple>(new Apple());
        Apple d = Apple.get();
        Apple.set(d);
        Holder<? extends Fruit> fruit = Apple;
        Fruit p = fruit.get();
        d = (Apple)fruit.get();
//        fruit.set(new Orange());
        try {
            Orange c = (Orange) fruit.get();
        } catch (Exception e) {
            System.out.println(fruit.equals(d));
        }
    }
}
