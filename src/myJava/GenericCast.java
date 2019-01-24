package myJava;
import static myJava.Print.*;
public class GenericCast {
	public static final int SIZE = 6;
	public static void main(String[] args) {
	FixedSizeStack<String> strings = new FixedSizeStack<String>(SIZE);
	for(String a : "A B C D E F".split(" "))
		strings.push(a);
	for(int i=0;i<SIZE;i++){
		String s = strings.pop();
		print(s);
	}

	}

}
