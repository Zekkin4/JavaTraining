package StringBufferPackage;



public class stringBuffert {
	
		public static void main(String[] args) {
			StBufferSub Buf = new StBufferSub("A");
			
			Thread t1 = new Thread(Buf);
			Thread t2 = new Thread(Buf);
			Thread t3 = new Thread(Buf);
			
			t1.start();
			t2.start();
			t3.start();
		}
	}

