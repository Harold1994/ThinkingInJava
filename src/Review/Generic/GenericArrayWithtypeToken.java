package Review.Generic;

import java.lang.reflect.Array;

public class GenericArrayWithtypeToken<T> {
    private T[] array;

    public GenericArrayWithtypeToken(Class<T> type, int size) {
        array = (T[]) Array.newInstance(type, size);
    }

    public void put(int index, T data) {
        array[index] = data;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArrayWithtypeToken<Integer> gai = new GenericArrayWithtypeToken<>(Integer.class, 10);
        Integer[] ia = gai.rep();
    }
}
