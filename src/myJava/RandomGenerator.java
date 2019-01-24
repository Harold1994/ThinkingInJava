package myJava;

import java.util.Random;

public class RandomGenerator{
	private static Random rand = new Random(47);	
	public static class Integer implements Generator<java.lang.Integer>{
		private int mod = 10000;
		public Integer(){}
		public Integer(int modulo){mod = modulo;}
		public java.lang.Integer next() {
			return rand.nextInt(mod);
		}	
	}
}
