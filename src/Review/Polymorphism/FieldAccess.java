package Review.Polymorphism;
class Super{
    private int field = 1;

    public int getField() {
        return field;
    }
}

class Sub extends Super{
    public int field = 0;

    public int getField() {
        return field;
    }
}
public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field:" + " sup getfield:" + sup.getField());
        Sub sub = new Sub();
        System.out.println("sup.field:" + sub.field + " sup getfield:" + sub.getField());
    }
}
