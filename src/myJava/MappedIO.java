package myJava;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;

public class MappedIO {
	private static int numodInts = 4000000;
	private static int numofBuffInts = 4000000;
	private abstract static class Tester{ 
		private String name;
		public Tester(String name){
			this.name = name;
		}
		public void runTest(){
			System.out.print(name + ":");
			try {
				long start = System.nanoTime();
				Test();
				double duration = System.nanoTime() - start;
				System.out.format("%.2f",duration/1.0e9);
			} catch (IOException e) {
				// TODO: handle exception
				throw new RuntimeException(e);
			}
		}
		public abstract void Test() throws IOException;
	}
	private static Tester [] Tests = {
		new Tester("Stream writer") {

			@Override
			public void Test() throws IOException {
				// TODO Auto-generated method stub
				DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("Temp.tmp"))));
				for(int i = 0; i< numodInts; i++)
					dos.writeInt(i);
				dos.close();
			}
			
		},
		new Tester("Mapped writer") {

			@Override
			public void Test() throws IOException {
				// TODO Auto-generated method stub
				FileChannel fc = new RandomAccessFile("temp.tmp","rw").getChannel();
				IntBuffer ib = fc.map(FileChannel.MapMode.READ_WRITE, 0, fc.size()).asIntBuffer();
				for(int i = 0; i< numofBuffInts; i++)
					ib.put(i);
				fc.close();
			}
		},
		new Tester("Stream read") {

			@Override
			public void Test() throws IOException {
				// TODO Auto-generated method stub
				DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(new File("Temp.tmp"))));
				for(int i = 0; i< numodInts; i++)
					dis.readInt();
				dis.close();
			}
			
		},
		new Tester("Mapped readder") {

			@Override
			public void Test() throws IOException {
				// TODO Auto-generated method stub
				FileChannel fc = new RandomAccessFile("temp.tmp","rw").getChannel();
				IntBuffer ib = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size()).asIntBuffer();
				for(int i = 0; i< numofBuffInts; i++)
					ib.get();
				fc.close();
			}
			
		},
		new Tester("stream read/write") {

			@Override
			public void Test() throws IOException {
				// TODO Auto-generated method stub
				RandomAccessFile raf = new RandomAccessFile(new File("temp.tmp"),"rw");
				raf.writeInt(1);
				for(int i=0;i<numodInts;i++)
				{
					raf.seek(raf.length()-4);
					raf.write(raf.readInt());
				}
				raf.close();
			}
			
		},
		new Tester("mapped read/write") {
			
			@Override
			public void Test() throws IOException {
				// TODO Auto-generated method stub
				FileChannel fc = new RandomAccessFile("temp.tmp","rw").getChannel();
				IntBuffer ib = fc.map(FileChannel.MapMode.READ_WRITE, 0, fc.size()).asIntBuffer();
				ib.put(0);
				for(int i = 1;i<numodInts;i++)
					ib.get(i-1);
				fc.close();
			}
		}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Tester test : Tests)
			test.runTest();
	}

}
