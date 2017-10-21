package myJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;

import javax.swing.text.AbstractDocument.Content;

public class ServerThread implements Runnable {
	Socket s = null;
	BufferedReader br = null;
	

	public ServerThread(Socket s) throws IOException {
		// TODO Auto-generated constructor stub
		this.s = s;
		br = new BufferedReader(new InputStreamReader(s.getInputStream(),"utf-8"));

	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		String content = null;
		while ((content = readFromClient()) != null) {
			for(Iterator<Socket> it = MyServer.socketList.iterator();it.hasNext();){
				Socket s = it.next();
				try {
					OutputStream os = s.getOutputStream();
					os.write((content + "\n").getBytes("utf-8"));
					System.out.println(content);
				} catch (SocketException e) {
					// TODO: handle exception
					e.printStackTrace();
					it.remove();
					System.out.println(MyServer.socketList);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}
	private String readFromClient(){
		try {
			return br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			MyServer.socketList.remove(s);
		}
		return null;
	}

}
