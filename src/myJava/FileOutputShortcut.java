package myJava;
import static myJava.Print.*;
import java.io.*;
public class FileOutputShortcut {
	static String file = "BasicFileOutput.out";
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("BasicFileOutput.java")));
		PrintWriter out = new PrintWriter(file);
		int lineCount = 1;
		String s;
		while((s = in.readLine()) !=null)
			out.println(lineCount++ + ":" + s);
		out.close();
		print(BufferedInputFile.read(file));
	}

}