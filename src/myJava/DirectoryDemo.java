package myJava;

public class DirectoryDemo {

	public static void main(String[] args) {
		PPrint.pprint(Directory.walk(".").files);
	}

}
