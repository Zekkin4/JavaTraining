package StringBufferPackage;

public class StBufferSub extends Thread {
StringBuffer SB;
	
	public StBufferSub(String s) {
		this.SB = new StringBuffer(s);
	}
	synchronized public void run() {
		int n;
		for(int i =0;i<100;i++) {
			System.out.println(SB);
		}
		n= SB.charAt(0);
		n++;
		SB.replace(0, 1, String.valueOf((char)n));
	}
}
