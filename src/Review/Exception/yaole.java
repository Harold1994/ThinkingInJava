package Review.Exception;

public class yaole extends Exception1 implements Exception2 {

    public yaole() throws OneException {
    }

    @Override
    public void f() {

    }

    @Override
    public void print() {
        System.out.println("lihe");
    }

    public static void main(String[] args) throws TwoException, OneException {
        yaole yy = new yaole();
        yy.print();
    }
}
