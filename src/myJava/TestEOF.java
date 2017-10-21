package myJava;
import static myJava.Print.*;
import java.io.*;
public class TestEOF {

	public static void main(String[] args) throws IOException {
		DataInputStream in = new DataInputStream(
				new BufferedInputStream(new FileInputStream("TestEOF.java")));
		while(in.available() != 0){
			printnb((char)in.readByte());
		}

	}

}
