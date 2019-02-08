package Review.JVM;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Singleton {
    private volatile static Singleton instance;
    private Singleton (){}
    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                if (instance==null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) throws IOException {
//        Singleton.getInstance();
        BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
        for (int i =0; i<100; i++)
            writer.write("孔婷");
        writer.close();

    }

}
