package tut1.api.threads.running;

import java.util.concurrent.TimeUnit;

public class FifthWay {

	public static void main(String[] args) {
		System.out.println("Thread principal inicia aqui...");
		
		new Thread(new Runnable() {
			
			public void run() {
				for(int i=10;i>0;i--) {
					System.out.println("TICK TICK "+i);
					try {
						TimeUnit.MILLISECONDS.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		System.out.println("Thread principal termina aqui...");

	}

}

