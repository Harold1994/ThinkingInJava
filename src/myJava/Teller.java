package myJava;

public class Teller {
private static long counter = 1;
private final long id = counter++;
private Teller(){}
public String toString(){
	return "Teller"+id;
}
public static Generator<Teller> generator(){
return new Generator<Teller>(){
		public Teller next() {
			// TODO Auto-generated method stub
			return new Teller();
		}
		
	};
}
}
