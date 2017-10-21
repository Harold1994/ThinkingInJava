package myJava;
import static myJava.Print.*;

import java.io.*;
import java.io.IOException;
public class StoringAndRecoveringData {

	public static void main(String[] args) throws IOException {
		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
				new FileOutputStream("Data.txt")));
		out.writeInt(123);
		out.writeUTF("That was pi");
		out.writeDouble(3.1415926);
		out.close();
		DataInputStream in = new DataInputStream(new BufferedInputStream(
				new FileInputStream("Data.txt")));
		print(in.readInt());
		print(in.readUTF());
		print(in.readDouble());

	}

}
