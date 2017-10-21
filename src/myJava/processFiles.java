package myJava;

import java.io.File;
import java.io.IOException;

public class processFiles {
	public interface Strategy {
		void process(File file);
	}

	private Strategy strategy;
	private String ext;

	public processFiles(Strategy strategy, String ext) {
		this.strategy = strategy;
		this.ext = ext;
	}
	
	public void start(String args[]){
		try{
			if(args.length == 0){
				processDirectoryTree(new File("."));
			}
			else{
				for(String arg : args){
					File filearg = new File(arg);
					if(filearg.isDirectory())
						processDirectoryTree(filearg);
					else {
						if(!arg.endsWith("."+ext))
							System.out.println(arg);
							arg += "."+ext;
						strategy.process(new File(arg).getCanonicalFile());
					}
				}
			}
		}catch (IOException e){
			throw new RuntimeException();
		}
		
	}

	private void processDirectoryTree(File root) throws IOException {
		for(File file : Directory.walk(root.getAbsolutePath(), ".*\\."+ext))
			strategy.process(file.getCanonicalFile());
		
	}
	
	public static void main(String args[]){
		new processFiles(new processFiles.Strategy() {
			
			@Override
			public void process(File file) {
				System.out.println(file);
				
			}
		},"png").start(args);;
		
		}
	}
