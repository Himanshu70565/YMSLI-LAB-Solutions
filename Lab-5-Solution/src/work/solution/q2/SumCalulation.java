package work.solution.q2;
class Runnable{
	private int number;
	
	public Runnable() {
		this.number=(int)(Math.random()*10+1);	
	}

	public int getNumber() {
		return number;
	}
}
class MyThread extends Thread{
	
	private Runnable randomNumber;
	
	@Override
	public void run() {
		randomNumber=new Runnable();
		System.out.println("start :==>"+Thread.currentThread().getName());
		System.out.println("--------randomNumber :"+randomNumber.getNumber()+"--------");
		System.out.println("end :==>"+Thread.currentThread().getName());
	}

	public int getRandomNumber() {
		return randomNumber.getNumber();
	}
	
}
public class SumCalulation {
	public static void main(String[] args) {
		
		System.out.println("start :"+Thread.currentThread().getName());
		
	
		MyThread thread1=new MyThread();
		MyThread thread2=new MyThread();
		MyThread thread3=new MyThread();
		MyThread thread4=new MyThread();
		MyThread thread5=new MyThread();
		
		MyThread array[]= {thread1,thread2,thread3,thread4,thread5};
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end: "+Thread.currentThread().getName());
		int sum=0;
		
		for(MyThread thread:array) {
			sum+=thread.getRandomNumber();
		}
		System.out.println("Total sum :"+sum);
	}
}
