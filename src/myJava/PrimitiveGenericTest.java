package myJava;
class Farray{
	public static <T> T[] fill(T[] a,Generator<T> gen){
		for(int i=0; i<a.length; i++)
			a[i] = gen.next();
		return a;
	}
}
public class PrimitiveGenericTest {

	public static void main(String[] args) {
		Integer[] integers =Farray. fill(new Integer[8],new RandomGenerator.Integer(10));
		for(int i:integers)
			System.out.println(i);
		
	}
}
