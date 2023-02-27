package Counter100_7;

public class Thread_2 {
	synchronized public void number() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			
			if (i % 10 == 0) {
				
				try {
					notify();
					wait();
				} catch (Exception e) {

				}
			}
		}
	}

	synchronized public void tenth() {
		for (int i = 1; i <= 10; i++) {
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
