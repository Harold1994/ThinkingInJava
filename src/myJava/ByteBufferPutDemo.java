package myJava;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class ByteBufferPutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer bb = ByteBuffer.allocate(1024);
		CharBuffer cb = bb.asCharBuffer();
		cb.put("a").put("b").put("c");
		cb.rewind();
		while(cb.hasRemaining())
			System.out.println(cb.get());
	}

}
