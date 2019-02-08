package Review.JVM;

public class AutoPackage {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3l;
        System.out.println(a == b);
        System.out.println(e == f);
        // 包装类的==不遇到运算符不会自动拆箱
        System.out.println(c == (a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        //包装类的equals方法不处理数据转型的问题
        System.out.println(g.equals(a+b));
        System.out.println(c.equals(d));
        System.out.println(e.equals(f));
    }
}
