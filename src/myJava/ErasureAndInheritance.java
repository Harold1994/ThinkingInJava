package myJava;
import static myJava.Print.*;
class GenericBase<T>{
	private T element;
	public void set(T args){
		args =element;
	}
	public T get(){
		return element;
	}
}
class Derived2 extends GenericBase{}
public class ErasureAndInheritance {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived2 d2 = new Derived2();
		//Object obj = d2.get();
		d2.set(123);
		Object obj = d2.get();
		print(obj);
	}

}
