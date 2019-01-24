package myJava;

import java.nio.ByteBuffer;

public class GetData {
	public static final  int BSIZE = 1024;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer bb = ByteBuffer.allocate(BSIZE);
		int i = 0;
		while(i++ < bb.limit())
			if(bb.get() != 0)
				System.out.println("nozero");
		System.out.println("i = " + i);
		bb.rewind();
		bb.asCharBuffer().put("HODY");
		char c;
		while((c = bb.getChar()) != 0)
			System.out.print(c+ " ");
		System.out.println();
		bb.rewind();
		bb.asShortBuffer().put((short) 71142);
		System.out.println(bb.getInt());
//		short s;
//		while((s = bb.getShort()) != 0)
//			System.out.print(s+ " ");
//		System.out.println();
//		bb.rewind();
//		System.out.println(bb.rewind());
	}

}
