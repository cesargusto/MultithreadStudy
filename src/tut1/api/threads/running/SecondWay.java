package tut1.api.threads.running;

import java.util.concurrent.TimeUnit;

public class SecondWay {

	public static void main(String[] args) {
		System.out.println("Thread principal inicia aqui...");
		
		new SecondTask().start();
		Thread t = new SecondTask();
		t.start();
		
		System.out.println("Thread principal termina aqui...");

	}

}

class SecondTask extends Thread{
	
	private static int count = 0;
	private int id;
	
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println("<" + id + ">TICK TICK "+i);
			try {
				TimeUnit.MILLISECONDS.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public SecondTask() {
		this.id = ++count;
	}
}
