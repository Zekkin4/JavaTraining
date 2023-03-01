package MultipleThreadStart;

public class StartedThrerad {
	public static void main(String[] args) {
	
		NewThread t = new NewThread();
		System.out.println("Hi");
		t.start();
		t.start();
	}

}
class NewThread extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		
		
	}
}

	

