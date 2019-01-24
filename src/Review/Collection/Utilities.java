package Review.Collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Utilities {
    static List<String> list = Arrays.asList("one two three four five six".split(" "));

    public static void main(String[] args) {
        System.out.println(list);
        System.out.println(Collections.disjoint(list, Collections.singletonList("four")));
        System.out.println(Collections.max(list));
        Collections.replaceAll(list,"one","ya");
        System.out.println(list);
    }
}
