package Exercise2;

public class OwnException_4 {
	public static void main(String[] args) {
		String s = "apple";

		try {

			if (s.equals("apple")) {

				throw new UException("String Mismatch");

			}
		} catch (UException e) {

			e.printStackTrace();
		}
	}
}

class UException extends Exception {
	public UException(String s) {
		
		super(s);
			
		
	}

}
