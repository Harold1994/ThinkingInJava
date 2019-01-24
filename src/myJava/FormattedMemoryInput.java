package myJava;
import static myJava.Print.*;
import java.io.*;
import java.io.IOException;
public class FormattedMemoryInput {

	public static void main(String[] args) throws IOException {
		try{
			DataInputStream in = new DataInputStream(new ByteArrayInputStream(
	
				BufferedInputFile.read("FormattedMemoryInput.java").getBytes()));
		while(true)
			printnb((char) in.readByte());
		}catch(EOFException r){
			print(r);
		}
	}

}
