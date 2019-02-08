package Review.Polymorphism;

public class PrivateOverride {
    int a = 10;
    private void f(){
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride p = new Derived();
        p.f();
        System.out.println(p.a);
    }
}

class Derived extends PrivateOverride {
    int a = 16;
    public void f() {
       System.out.println("public f()");
   }
}
