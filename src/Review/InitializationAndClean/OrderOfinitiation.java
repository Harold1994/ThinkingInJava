package Review.InitializationAndClean;
class Window{
    public Window(int marker) {
        System.out.println("window :" + marker);
    }
}

class House{
    Window w1 = new Window(1);

    public House() {
        System.out.println("House()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);
    void f() {
        System.out.println("s");
    }

    Window w3 = new Window(3);
}
public class OrderOfinitiation {

    public static void main(String[] args) {
        House s = new House();
    }

}
