package Review.TypeInfo;
class Toy {
    Toy() {}
    Toy(int i) {}
}

class FancyToy extends Toy implements Runnable {
    public FancyToy() {
        super(1);
    }

    @Override
    public void run() {

    }
}
public class genericToyTest  {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<FancyToy> ft = FancyToy.class;
        FancyToy fancyToy = ft.newInstance();

        Class<? super FancyToy> ups = ft.getSuperclass();

    }
}
