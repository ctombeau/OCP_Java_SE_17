package ht.certification.concurency;

//public class LearnThread implements Runnable{
	//or
public class LearnThread extends Thread{
	
	Runnable printInventory = ()->System.out.println("printing zoo inventory");
	Runnable printRecords = ()->{
		for(int i=0; i<3; i++)
		{
			System.out.println("printing Record: "+i);
		}
	};
	
//	@FunctionalInterface 
//	public interface Runnable {
//		 void run();
//	}
	
	public void TestThread()
	{
		System.out.println("begin");
		new Thread((java.lang.Runnable) printInventory).start();
		new Thread((java.lang.Runnable) printRecords).start();
		new Thread((java.lang.Runnable) printInventory).start();
		
		System.out.println("end");
	}
	
	public void TestThread2()
	{
		
		System.out.println("begin");
		new Thread((java.lang.Runnable) printInventory).run();
		new Thread((java.lang.Runnable) printRecords).run();
		new Thread((java.lang.Runnable) printInventory).run();
		
		System.out.println("end");
	}
	
	public static void Pause()
	{
		try
		{
			Thread.sleep(10_000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("Thread Finished");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
