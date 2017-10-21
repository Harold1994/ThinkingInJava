package myJava;
import java.util.*;
import static myJava.Print.*;
class product{
	private final int id;
	private String description;
	private double price;
	public product(int IDNumber,String desc,double price){
		id = IDNumber;
		description = desc;
		this.price = price;
	}
	public String toString(){
		return id+": "+description+", price:$"+price;
	}
	public static Generator<product> generator = new Generator<product>(){
		Random rand = new Random(47);
		public product next(){
			return new product(rand.nextInt(1000),"Test",Math.round(rand.nextDouble()*1000)+0.99);
		}
			
		};
	}
class Shelf extends ArrayList<product>{
	public Shelf(int nProduct){
		Generators.fill(this, product.generator, nProduct);
	}
}

class Aisle extends ArrayList<Shelf>{
	public Aisle(int nShelves,int nProduct){
		for(int i = 0; i< nShelves; i++)
			add(new Shelf(nProduct));
	}
}
class CheckoutStand{};
class Office{};
public class Store extends ArrayList<Aisle> {
	private ArrayList<CheckoutStand> checkouts = new ArrayList<CheckoutStand>();
	private Office office = new Office();
	public Store(int nAisle,int nShelves,int nProduct){
		for(int i = 0;i<nAisle;i++)
			add(new Aisle(nShelves,nProduct));
	}
	public String toString(){
		StringBuilder result = new StringBuilder();
		for(Aisle a: this)
			for(Shelf s: a)
				for(product p :s){
					result.append(p);
					result.append("\n");
				}
		return result.toString();
				
		
	}
	public static void main(String[] args) {
		print(new Store(1,2,1));
	}

}
