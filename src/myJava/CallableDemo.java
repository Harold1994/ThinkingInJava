
package myJava;
import static myJava.Print.*;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/**

 * Callable �� Future�ӿ�

 * Callable��������Runnable�Ľӿڣ�ʵ��Callable�ӿڵ����ʵ��Runnable���඼�ǿɱ������߳�ִ�е�����

 * Callable��Runnable�м��㲻ͬ��

 * ��1��Callable�涨�ķ�����call()����Runnable�涨�ķ�����run().

 * ��2��Callable������ִ�к�ɷ���ֵ����Runnable�������ǲ��ܷ���ֵ�ġ�

 * ��3��call()�������׳��쳣����run()�����ǲ����׳��쳣�ġ�

 * ��4������Callable������õ�һ��Future����

 * Future ��ʾ�첽����Ľ�������ṩ�˼������Ƿ���ɵķ������Եȴ��������ɣ�����������Ľ����

 * ͨ��Future������˽�����ִ���������ȡ�������ִ�У����ɻ�ȡ����ִ�еĽ����

 */
class TaskWithResult implements Callable<String>{
	private int id;
	public TaskWithResult(int id){
		this.id = id;
	}
	public String call(){
		return "result of taskwithresult " + id;
	}
}
public class CallableDemo {

	public static void main(String[] args) {
		ExecutorService es= Executors.newCachedThreadPool();
		ArrayList<Future<String>> al = new ArrayList<Future<String>>();
		for(int i = 0; i <10 ;i++)
			al.add(es.submit(new TaskWithResult(i)));
		for(Future<String>fs : al)
		{
			try {
				print(fs.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				es.shutdown();
			}
		}

	}

}
