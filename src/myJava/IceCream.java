package myJava;
import static myJava.Print.*;

import java.util.Arrays;
import java.util.Random;

public class IceCream {
	public static Random rand = new Random(47); 
	static final String [] flavor = {"a","b","c","d","e","f","g","h","i","j"};
	public static String [] FlavorSet(int n){
		if(n > flavor.length )
			throw new IllegalArgumentException("Set too big");
		String [] result = new String[n];
		boolean [] picked = new boolean[flavor.length];
		for(int i = 0; i < n; i++){
			int t;
			do
				t =rand.nextInt(flavor.length);
			while(picked[t]);
			result[i] = flavor[t];
			picked[t] = true;
		}
		return result;
	}
	public static void main(String[] args) {
		for(int i = 0; i< 7; i++)
			print(Arrays.toString(FlavorSet(3)));
	}

}
