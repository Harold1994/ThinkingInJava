package myJava;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZIPCompress {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		if(args.length == 0){
			System.out.println("Usage: \nGZIPcompress file\n"+
					"\tUses GZIP compression to compress"
					+"the file to test.gzip");
			System.exit(1);
		}
			
		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		BufferedOutputStream out = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("test.gz")));
		System.out.println("begin to write");
		int c;
		while((c = in.read()) != -1){
			out.write(c);
		}
		in.close();
		out.close();
		System.out.print("write over");
		BufferedReader br = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("test.gz"))));
		String s;
		while((s = br.readLine()) != null){
			System.out.println(s);
		}
	}

}
