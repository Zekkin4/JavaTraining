package Counter100_7;

public class Thread_2 {
	synchronized public void number() {
		for (int i = 1; i <= 100; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			System.out.println(i);

			if (i % 10 == 0) {
				notify();
				try {
					wait();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

		}

	}

	synchronized public void tenth() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("\nSet of Ten \n");
			notify();

			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}
}
