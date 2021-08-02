package work.solution.q2;
class Job implements Runnable{

	private int randNumber;
	
	public Job() {
		this.randNumber=(int)(Math.random()*10+1);	;
	}
	
	@Override
	public void run() {
		System.out.println("start :==> "+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName()+" , randnumber :==>"+this.randNumber);
		System.out.println("end  :==> "+Thread.currentThread().getName());
	}

	public int getRandomNumber() {
		return this.randNumber;
	}
	
}
public class SumCalulation {
	public static void main(String[] args) {
		
System.out.println("start :"+Thread.currentThread().getName());
		
		Job job1=new Job();
		Job job2=new Job();
		Job job3=new Job();
		Job job4=new Job();
		Job job5=new Job();
		
		Job jobArray[]= {job1,job2,job3,job4,job5};
		
		Thread thread1=new Thread(job1,"thread1");
		Thread thread2=new Thread(job2,"thread2");
		Thread thread3=new Thread(job3,"thread3");
		Thread thread4=new Thread(job4,"thread4");
		Thread thread5=new Thread(job5,"thread5");
		
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
		
		
		System.out.println("end :"+Thread.currentThread().getName());
		int sum=0;
		for(Job job:jobArray) {
			sum+=job.getRandomNumber();
		}
	
		System.out.println("Random number sum: "+sum);
	}
}
