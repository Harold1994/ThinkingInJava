package myJava;

public class GeneratorsTest {
private static int size = 10;
public static void test(Class<?> surrundingClass){
	for(Class<?> type : surrundingClass.getClasses()){
		System.out.println(type.getSimpleName() + ": ");
		try {
			Generator<?> g = (Generator<?>)type.newInstance();
			for(int i = 0;i<size;i++){
				System.out.print(g.next() + " ");
			}
			System.out.println();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
	public static void main(String[] args) {
		test(CountingGenerator.class);

		
	}

}
