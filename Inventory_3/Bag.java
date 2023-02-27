package Inventory_3;

public class Bag {
	static int size = 0;

	synchronized public  void Producer() {
		if (size == 1) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			++size;
			System.out.println("1 =" + size);
			notify();
		

	}

	synchronized public void Consumer() {
		if (size == 0) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			--size;
			System.out.println("2 =" + size);
			notify();
	}
}
