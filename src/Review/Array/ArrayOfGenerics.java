package Review.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfGenerics {
//    static <T> T[] f() {
////        return new T[1];
//    }
    public static void main(String[] args) {
        List<String> [] ls;
        List [] la = new List[10];
        ls = (List<String>[]) la;

        ls[0] = new ArrayList<String>();

    }
}
