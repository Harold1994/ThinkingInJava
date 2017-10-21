package myJava;
import static myJava.Print.*;

import java.io.*;
import java.io.IOException;
public class BufferedInputFile {
	public static String read(String filename) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(filename));
		StringBuilder sb = new StringBuilder();
		String s;
		while((s = in.readLine())!=null)
			sb.append(s + "\n");
		in.close();
		return sb.toString();
		}
	
}
