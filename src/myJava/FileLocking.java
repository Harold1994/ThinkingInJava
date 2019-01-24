package myJava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

public class FileLocking {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("file.txt");
		FileLock fl = fos.getChannel().tryLock();
		if(fl != null)
		{
			System.out.println("Locked file");
			TimeUnit.MILLISECONDS.sleep(100);
			fl.release();
			System.out.println("file unlocked");
		}
		fos.close();
	}

}
