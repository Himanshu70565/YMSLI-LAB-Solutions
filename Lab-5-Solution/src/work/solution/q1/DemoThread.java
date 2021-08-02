package work.solution.q1;
class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("[ "+Thread.currentThread().getName()+" : "+i+" ]");
		}
	}
	
}
public class DemoThread {
	public static void main(String[] args) {
		Thread thread1=new Thread(new MyThread(),"thread1");
		Thread thread2=new Thread(new MyThread(),"thread2");
		Thread thread3=new Thread(new MyThread(),"thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
