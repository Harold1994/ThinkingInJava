package Review.Exception;

public abstract class Exception1 {
    public Exception1() throws OneException{
    }

    public  void print() throws TwoException, OneException{
        System.out.println("Exception 1");
    }
}
