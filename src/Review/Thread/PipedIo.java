package Review.Thread;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
class Sender implements Runnable {
    private Random rand = new Random(47);
    private PipedWriter writer = new PipedWriter();

    public PipedWriter getWriter() {
        return writer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                for (char c = 'A'; c<='z'; c++) {
                    writer.write(c);
                    TimeUnit.MILLISECONDS.sleep(rand.nextInt(500));
                }
            }
        }catch (IOException e) {
            System.out.println("sender ioexception");
        } catch (InterruptedException e) {
            System.out.println("sender interrupted" );
        }
    }
}

class Receiver implements Runnable {
    private PipedReader in ;
    public Receiver(Sender sender) throws IOException {
        in = new PipedReader(sender.getWriter());
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.print("Read: " + (char)in.read() + ",");
            }
        } catch (IOException e) {
            System.out.println("Receiver  + Receiver read exception");
        }
    }
}
public class PipedIo {

    public static void main(String[] args) throws IOException, InterruptedException {
        Sender sender = new Sender();
        Receiver receiver = new Receiver(sender);
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(sender);
        service.execute(receiver);
        TimeUnit.MILLISECONDS.sleep(1000);
        service.shutdownNow();
    }
}
