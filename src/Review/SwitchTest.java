package Review;

import java.util.Random;

public class SwitchTest {
    public static void main(String[] args) {
        int a = new Random().nextInt(10);
        System.out.println(a + "");
        switch (a) {
            case 1:
                System.out.println(a);
            case 2:
                System.out.println(a);
            case 3:
                System.out.println(a);
            case 4:
                System.out.println(a);
            case 5:
                System.out.println(a);
            case 6:
                System.out.println(a);break;
            default:
                System.out.println("larger then 6");
        }
    }
}
