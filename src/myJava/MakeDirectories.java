package myJava;

import java.io.File;

import org.omg.CORBA.PRIVATE_MEMBER;

public class MakeDirectories {
	private static void fileData(File f){
		System.out.println(
				"AbsolutePath: " + f.getAbsolutePath()+
				"\n CanRead: " + f.canRead()+
				"\n CanWrite: " + f.canWrite()+
				"\n getParent: " + f.getParent()+
				"\n getPath: "+ f.getPath() + 
				"\n length: " + f.length()+
				"\n lastModified" + f.lastModified());
		if(f.isFile())
			System.out.println("It's is a file.");
		else if(f.isDirectory())
			System.out.println("It's a directory.");
	}
	private static void usage(){
		System.err.println("usage");
		System.exit(1);
	}
	public static void main(String[] args) {
		if(args.length < 1)
			usage();
		if(args[0].equals("-r")){
			if(args.length < 3)
				usage();
			File
				old = new File(args[1]),
				rname = new File(args[2]);
			old.renameTo(rname);
			fileData(old);
			fileData(rname);
			return;
		}
		int count = 0;
		boolean del = false;
		if(args[0].equals("-d")){
			count++;
			del = true;
		}
		count --;
		while(++count < args.length){
			File f = new File(args[count]);
			if(f.exists()){
				System.out.println(f + "exists");
			if(del){
				System.out.println("deleting " + f);
				f.delete();
			}
			}
			else{
				if(!del){
					f.mkdirs();
					System.out.println("create" + f);
					fileData(f);
				}
			}
			fileData(f);
		}
		

	}

}
