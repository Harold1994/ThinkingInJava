package myJava;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.LongBuffer;

public class ViewBuffers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer bb = ByteBuffer.wrap(new byte[]{0,0,0,0,0,0,0,'a'});
		bb.rewind();
		System.out.println("ByteBuffer:");
		while(bb.hasRemaining()){
			System.out.print(bb.position() + "->" +bb.get()+",");
		}
		System.out.println();
		
		CharBuffer cb = ((ByteBuffer) bb.rewind()).asCharBuffer();
		System.out.println("CharBuffer:");
		while(cb.hasRemaining()){
			System.out.print(cb.position() + "->" +cb.get()+",");
		}
		System.out.println();
		
		LongBuffer lb = ((ByteBuffer) bb.rewind()).asLongBuffer();
		System.out.println("LongBuffer:");
		while(lb.hasRemaining()){
			System.out.print(lb.position() + "->" +lb.get()+",");
		}
		System.out.println();
		
	}

}
