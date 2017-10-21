package myJava;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MyServer {
	public static ArrayList<Socket> socketList = new ArrayList<Socket>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(9600);
		while(true){
			Socket s = ss.accept();
			socketList.add(s);
			new Thread(new ServerThread(s)).start();
			
		}
		
	}

}
