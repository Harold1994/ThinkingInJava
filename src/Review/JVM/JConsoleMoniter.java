package Review.JVM;

import java.util.ArrayList;
import java.util.List;

public class JConsoleMoniter {
    static class OOMObject{
        public byte[] placeholder = new byte[64 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<OOMObject>();
        for (int i = 0; i<num; i++) {
            Thread.sleep(80);
            list.add(new OOMObject());
        }

    }

    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000);
        System.gc();
        Thread.sleep(1000);
    }
}
