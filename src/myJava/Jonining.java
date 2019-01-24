package myJava;
class Sleeper extends Thread{
	private int duration;
	public Sleeper(String name, int sleeptime){
		super(name);
		duration = sleeptime;
		start();
	}
	public void run(){
		try {
			sleep(duration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(getName() + "was interrupted. " + "isInterrupted:" + isInterrupted());
			return;
		}
		System.out.println(getName() + "is awaken");
	}
}
class Joiner extends Thread{
	private Sleeper sleeper;
	public Joiner(String name,Sleeper sleeper){
		super(name);
		this.sleeper = sleeper;
		start();
	}
	public void run(){
		try {
			sleeper.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			Print.print("interrupted");
		}
		Print.print(getName() + "join accompleted");
	}
}
public class Jonining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sleeper
			sleepy = new Sleeper("Sleepy", 1500),
			glupy = new Sleeper("glupy", 1500);
		Joiner
			dopey = new Joiner("Dopey", sleepy),
			doc = new Joiner("doc", glupy);
		glupy.interrupt();
	}

}
