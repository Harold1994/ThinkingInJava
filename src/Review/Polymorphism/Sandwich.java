package Review.Polymorphism;
class sup {
    public sup() {
        System.out.println("sup construct");
    }
}
class Apple{
    public Apple() {
        System.out.println("construct apple");
    }
}

class App{
    public App() {
        System.out.println("construct app");
    }
}

class sub1 extends sup {
    Apple app = new Apple();
    public sub1() {
        System.out.println("construct sub1");
    }
}

public class Sandwich extends sub1 {
    App a = new App();
    public static void main(String[] args) {
        new Sandwich();
    }
}
