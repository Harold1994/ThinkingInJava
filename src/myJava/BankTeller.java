package myJava;
import static myJava.Print.*;

import java.util.*;
import java.util.Random;
public class BankTeller {
	public static void Serve(Teller t,Customer c){ 
		print(t +"serves" + c);
	}
public static void main(String args []){
	Random rand = new Random(47);
	Queue<Customer> line = new LinkedList<Customer>();
	Generators.fill(line, Customer.generator(), 15);
	List<Teller> tellers = new ArrayList<Teller>();
	Generators.fill(tellers, Teller.generator(), 4);
	for(Customer c : line){
		Serve(tellers.get(rand.nextInt(tellers.size())),c);
	}
}
}
