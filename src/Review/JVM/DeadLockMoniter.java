package Review.JVM;

public class DeadLockMoniter {
    static class SynAddRunnable implements Runnable {
        String a,b;

        public SynAddRunnable(String a, String b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            synchronized (a) {
                synchronized (b) {
                    System.out.println(a + b);
                }
            }
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i<100; i++) {
            new Thread(new SynAddRunnable("1","2")).start();
            new Thread(new SynAddRunnable("2","1")).start();

        }
    }
}
