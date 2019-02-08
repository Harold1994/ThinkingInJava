package Review.Polymorphism;
class Shared{
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("creating " + this);
    }

    public void addRef(){
        refcount ++;
    }

    protected void dispose(){
        if (--refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long count = 0;
    private final long id = count++;

    public Composing(Shared shared) {
        System.out.println("Createing " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose(){
        System.out.println("disposing " + this);
        shared.dispose();
    }
    @Override
    public String toString() {
        return "Composing " + id;
    }
}
public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing [] composings = new Composing[10];
        for (int i= 0; i<10; i++) {
            composings[i] = new Composing(shared);
        }
        for (Composing compos : composings)
            compos.dispose();
    }
}
