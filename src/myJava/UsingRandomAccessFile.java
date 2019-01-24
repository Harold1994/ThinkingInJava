package myJava;
import static myJava.Print.*;
import java.io.*;
public class UsingRandomAccessFile {
	static String file = "rtest.dat";
	static void display() throws IOException{
		RandomAccessFile rf = new RandomAccessFile(file,"r");
		for(int i = 0; i < 7; i++)
			print("value " + i+": "+rf.readDouble());
		print(rf.readUTF());
		rf.close();
	}
	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile(file,"rw");
		for(int i = 0; i < 7; i++){
			rf.writeDouble(i*2.5);
		}
		rf.writeUTF("the end of the file");
		rf.close();
		display();
		rf = new RandomAccessFile(file,"rw");
		rf.seek(5*8);
		rf.writeDouble(47.0008);
		rf.close();
		display();

	}

}
