package Review.Array;

import java.util.Arrays;

public class ThreeDWithNew {
    public static void main(String[] args) {
        int [][][] a = new int[2][2][4];
        System.out.println(Arrays.deepToString(a));//此时用Arrays.toString的话会输出第二阶数组的对象引用
    }
}
