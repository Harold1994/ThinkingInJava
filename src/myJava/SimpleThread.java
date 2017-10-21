package myJava;

public class SimpleThread extends Thread{
	private int countDown = 5;
	private static int ThreadCount = 0;
	public SimpleThread(){
		super(Integer.toString(++ThreadCount));
		start();
	}
	public String toString(){
		return "#"+ getName() + "("+countDown+")";
	}
	public void run(){
		while(true){
			System.out.println(this);
			if(--countDown == 0)
				return;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i <5; i++)
			new SimpleThread();
			}

}
