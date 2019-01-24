package myJava;
import static myJava.Print.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;
class Data implements Serializable{
	private int n ;
	public Data(int n) {this.n = n;}
	public String toString() {return Integer.toString(n);}
}
public class Worm implements Serializable {
	public Random rand = new Random(47);
	public Data [] data = {
			new Data(rand.nextInt(1)),
			new Data(rand.nextInt(108)),
			new Data(rand.nextInt(10))
	};
	private Worm next;
	private char c;
	public Worm(int i,char x)
	{
		print("Worm constructor " + i);
		c = x;
		if(--i > 0)
			next = new Worm(i,(char)(x+1));
	}
	public Worm(){print("Default constructor");}
	public String toString(){
		StringBuilder result = new StringBuilder(":");
		result.append(c);
		result.append("(");
		for(Data dat : data)
			result.append(dat);
		result.append("");
		if(next!=null)
			result.append(next);
		return result.toString();
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Worm w = new Worm(6,'a');
		print("w" + w);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("worm.out"));
		out.writeObject("worm storage\n");
		out.writeObject(w);
		out.close();
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("worm.out"));
		String s = (String) in.readObject();
		Worm w2 = (Worm) in.readObject();
		print(s + "w2 = " + w2);
	}

}
