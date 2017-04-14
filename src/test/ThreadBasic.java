package test;

public class ThreadBasic implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		Thread thread = new Thread(new ThreadBasic());
		thread.setName("Parent");
		Thread thread2 = new Thread(new ThreadBasic());
		thread2.setName("Child");
		thread.start();
		thread.join();
		thread2.start();
		thread2.join();
		System.out.println("main");
		
		System.out.println(Thread.activeCount());
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0 ;i<5; ++i) {
			if(Thread.currentThread().getName() == "Parent") {
			}
		System.out.println("Inside run : " +  Thread.currentThread().getName() + " i : "+ i +
				" prioirity : " + Thread.currentThread().getPriority());
		}
	}

}
