package myJava;

import java.util.concurrent.TimeUnit;

public class SimpleDeamons implements Runnable {
	public void run(){
		try{
			while(true){
				TimeUnit.MILLISECONDS.sleep(100);
				Print.print(Thread.currentThread() + " " + this);
			}
		}catch (InterruptedException e){
			Print.print("INTERRUPTED");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		for(int i = 0; i <10; i++){
			Thread deamon = new Thread(new SimpleDeamons());
			deamon.setDaemon(true);
			deamon.start();
		}
		Print.print("all deamons started");
		TimeUnit.MILLISECONDS.sleep(10);
	}
}
