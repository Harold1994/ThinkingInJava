package myJava;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class IntBufferDemo {
	private static final int BSIZE = 1024;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer bb = ByteBuffer.allocate(BSIZE);
		IntBuffer ib = bb.asIntBuffer();
		ib.put(new int[] {1,2,4,5,6,7,8});
		System.out.println(ib.get(3));
		ib.put(3, 1233);
		ib.flip();
		while(ib.hasRemaining())
			System.out.println(ib.get());
	}

}
