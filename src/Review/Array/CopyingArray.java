package Review.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyingArray {
    public static void main(String[] args) {
        int [] i = new int[7];
        int [] j = new int[10];
        Arrays.fill(i,47);
        Arrays.fill(j,103);
        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.toString(j));

        System.arraycopy(i,0,j,0,i.length);
        System.out.println(Arrays.toString(j));
        i[0] = 9;
        System.out.println(Arrays.toString(j));

        Integer [] u = new Integer[10];
        Integer[]v = new Integer[7];
        Arrays.fill(u,19);
        Arrays.fill(v,2);
        System.out.println(Arrays.toString(u));
        System.out.println(Arrays.toString(v));
        System.arraycopy(u, 0,v,0,v.length);
        System.out.println(Arrays.toString(u));
        System.out.println(Arrays.toString(v));
        u[0] = new Integer(0);
        System.out.println(Arrays.toString(v));
    }
}
