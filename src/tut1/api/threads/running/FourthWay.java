package tut1.api.threads.running;

import java.util.concurrent.TimeUnit;

public class FourthWay {

	public static void main(String[] args) {
		System.out.println("Thread principal inicia aqui...");
		
		new Thread(new FourthTask()).start();
		Thread t = new Thread(new FourthTask());
		t.start();
		
		System.out.println("Thread principal termina aqui...");

	}

}

class FourthTask implements Runnable{
	
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
	
	public FourthTask() {
		this.id = ++count;
	}
}
