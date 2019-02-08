package Review.JVM;

import java.util.ArrayList;
import java.util.List;

public class GenericTypes {
//    public static String method(List<String> list) {
//        System.out.println("invoke method(List<String> list");
//        return "";
//    }

    public static int method(List<Integer> list) {
        System.out.println("invoke method(List<Integer> list");
        return 0;
    }

    public static void main(String[] args) {
        method(new ArrayList<Integer>());
//        method(new ArrayList<String>());
    }
}
