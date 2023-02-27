package MultipleThreadStart;

public class StartedThrerad {
	public static void main(String[] args) {
	
		Thread t = new Thread();
		System.out.println("Hi");
		t.start();
		t.start();
	}

}
class NewThread implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		
	}
}
