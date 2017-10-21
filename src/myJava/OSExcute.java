package myJava;

import java.io.*;

public class OSExcute {
	public static void Command(String command){
		boolean err = false;
		
		try {
			Process process = new ProcessBuilder(command.split(" ")).start();
			BufferedReader results= new BufferedReader(new InputStreamReader(process.getInputStream()));
			String s;
			while((s = results.readLine()) != null){
				System.out.println(s);
			}
			BufferedReader errors= new BufferedReader(new InputStreamReader(process.getErrorStream()));
			while((s = errors.readLine()) != null){
				System.err.println(s);
				err = true;
			}
		} catch (Exception e) {
			if(!command.startsWith("CMD /C"))
				Command("CMD /C" + command);
			else 
				throw new RuntimeException(e);
		}
		if(err)
			throw new OSExcuteException("Errors excuting:" + command);
	}
}
