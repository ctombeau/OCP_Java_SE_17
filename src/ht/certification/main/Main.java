package ht.certification.main;

import ht.certification.concurency.LearnThread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("On commence le TP de la certification");
         //new LearnThread().TestThread();
         Thread job = new Thread(()->new LearnThread().Pause());
         System.out.println(job.getState());
         System.out.println(job.currentThread());
         job.interrupt();
         // the scommand stop the execution
         job.setDaemon(true);
         job.start();
         
         System.out.println("Main method finished");
	}

}
