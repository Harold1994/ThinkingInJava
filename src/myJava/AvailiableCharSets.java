package myJava;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;

public class AvailiableCharSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap<String, Charset> charSets = Charset.availableCharsets();
		Iterator<String> it = charSets.keySet().iterator();
		while(it.hasNext()){
			String csname = it.next(); 
			System.out.print(csname);
			Iterator aliases = charSets.get(csname).aliases().iterator();
			if(aliases.hasNext())
				System.out.print(":");
				while(aliases.hasNext()){
					System.out.print(aliases.next());
					if (aliases.hasNext()) {
						System.out.print(",");
					}
				}
				System.out.println("");	
			}
		
	}

}
