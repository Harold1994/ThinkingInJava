package myJava;
import java.util.*;
import static myJava.Print.*;
class Frob{}
class Forkle{}
class Quark<Q>{}
class particle<POSITION,MOMENTUM>{}
public class LostInformation {
	public static void main(String[] args) {
		List<Frob> list = new ArrayList<Frob>();
		Map<Frob,Forkle> map = new HashMap<Frob,Forkle>();
		Quark<Forkle> q = new Quark<Forkle>();
		particle<Long,Double> p = new particle<Long,Double>();
		print(Arrays.toString(list.getClass().getTypeParameters()));
		print(Arrays.toString(map.getClass().getTypeParameters()));
		print(Arrays.toString(q.getClass().getTypeParameters()));
		print(Arrays.toString(p.getClass().getTypeParameters()));
	}

}
