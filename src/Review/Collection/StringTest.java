package Review.Collection;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class StringTest {
    public static void main(String[] args) {
        String [] hellos = "hello hello".split(" ");
        System.out.println(hellos[0].hashCode());
        System.out.println(hellos[1].hashCode());
        String str = new String("hello");
        System.out.println(str.hashCode());
        System.out.println("hello".hashCode());
    }
}