package myJava;

import java.util.Arrays;

class ClassParameter<T>{
	public T[] f(T[] t){
		return t;
	}
}
class methodParameter{
	public static <T> T[] f(T[] t){
		return t;
	}
}
public class ParameterizedArrayType {

	public static void main(String[] args) {
		Integer [] ints = {1,2,3,4,5};
		Double [] doubles = new Double[5];
		Arrays.fill(doubles, 3.3);
		System.out.println(Arrays.toString(doubles));

	}

}
