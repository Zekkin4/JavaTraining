package EverOrOdd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

	public class OddEvenThread {

		public static void main(String[] args) {

			ExecutorService es = Executors.newFixedThreadPool(2);

			es.execute(() -> {
				Odd();
				try {
					Thread.sleep(1);
				} catch (Exception e) {

				}
			});
			es.execute(() -> {
				Even();
				try {
					Thread.sleep(1);
				} catch (Exception e) {

				}
			});
			es.shutdown();

		}

		public static void Odd() {
			for (int i = 1; i <= 100; i += 2) {
				System.out.println(i);
			}
		}

		public static void Even() {
			for (int i = 2; i <= 100; i += 2) {
				System.out.println(i);
			}
		}
	}


