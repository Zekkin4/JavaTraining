package Inventory_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Inventory {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Bag b = new Bag();
		int a = 1;
		es.execute(() -> {
			for (int i = 0; i < 5; i++) {
				b.Consumer();
			}
		});
		es.execute(() -> {
			for (int i = 0; i < 5; i++) {
				b.Producer();

			}
		});

		es.shutdown();
		es.shutdown();
	}
}
