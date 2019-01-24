package Review.IO;

import myJava.BufferedInputFile;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;

public class FormattedMemoryInput {
    public static void main(String[] args) {
        try {
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(
                    BufferedInputFile.read("b.txt").getBytes()
            ));
            while (in.available() != 0) {
                System.out.println((char) in.readByte());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
