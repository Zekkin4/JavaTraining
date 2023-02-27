package SynchronousThread_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SyncThread {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(4);
		es.execute(() -> {
			syncMsg("Thread - 1");
			try {

			} catch (Exception e) {

			}
		});
		es.execute(() -> {
			syncMsg("Thread - 2");
			try {

			} catch (Exception e) {

			}
		});
		es.execute(() -> {
			syncMsg("Thread - 3");
			try {

			} catch (Exception e) {

			}
		});
		es.execute(() -> {
			syncMsg("Thread - 4");
			try {
				// Thread.sleep(1);
			} catch (Exception e) {

			}
		});
		es.shutdown();

	}

	synchronized static void syncMsg(String s) {
		System.out.println("[------" + s + "------]");
	}

}
