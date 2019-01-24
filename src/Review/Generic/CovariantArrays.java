package Review.Generic;

import java.util.ArrayList;
import java.util.List;

class Fruit{}
class Apple extends Fruit{}
class Orange extends Fruit{}
class li extends Apple{}
public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruits = new Apple[10];
        try {
            fruits[0] = new Fruit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
             fruits[1] = new Orange();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            fruits[2] = new li();
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<? extends Fruit> flist = new ArrayList<Apple>();
        flist.add(null);
    }
}
