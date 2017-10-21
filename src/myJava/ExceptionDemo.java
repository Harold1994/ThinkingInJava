package myJava;
public class ExceptionDemo {
	public int inc(){
		int x ;
		try{
			x = 1;
			
		}catch (Exception e){
			x = 2;
			return x;
		}finally{
			x = 3;
			return x;
		}
	}
	public static void main(String[] args) {
		ExceptionDemo exceptionDemo = new ExceptionDemo();
		int a = exceptionDemo.inc();
		System.out.println(a);
	}

}
