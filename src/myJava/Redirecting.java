package myJava;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Redirecting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintStream console = System.out;
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("b.txt"));
		PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("test.out")));
		System.setIn(in);
		System.setOut(out);
		System.setErr(out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s ;
		while((s = br.readLine()) != null){
			System.out.println(s);
		}
		out.close();
		System.setOut(console);
	}

}
