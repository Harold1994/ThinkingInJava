package Review.Generic;

class Generic<T> {}

public class ArrayOfGeneric {
    static final int size = 100;
    static Generic<Integer>[] gia;

    public static void main(String[] args) {
        gia =(Generic<Integer>[]) new Generic[size];
        System.out.println(gia.getClass().getName());
        gia[0] = new Generic<Integer>();
    }
}
