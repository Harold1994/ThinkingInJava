package myJava;
import java.io.IOException;
import java.io.StringReader;
import static myJava.Print.*;
public class MemeryInput {

	public static void main(String[] args) throws IOException{
		StringReader in = new StringReader(BufferedInputFile.read("MemeryInput.java"));
		int c;
		while((c = in.read())!=-1)
			printnb((char) c);

	}

}
