package myJava;

import java.util.*;
class pet1{}
class dog1 extends pet1{}
public class GenericWriting {
static <T> void writeExact(List<T> list,T item){
	list.add(item);
}
static <T> void WriteWithWildcard(List<? super T> list,T item){
	list.add(item);
}
static List<dog1> dog1 = new ArrayList<dog1>();
static List<pet1> pet1 = new ArrayList<pet1>();
static void f1(){
	writeExact(dog1,new dog1());
	writeExact(pet1,new dog1());
}
static void f2(){
	WriteWithWildcard(dog1,new dog1());
	WriteWithWildcard(pet1,new dog1());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f1();
		f2();
		
	}

}
