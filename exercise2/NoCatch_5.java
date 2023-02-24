package Exercise2;

public class NoCatch_5 {
public static void main(String[] args) {
	
	newException ex = new newException();
	try {
		ex.exception_mth();
	}
}

}
class newException{
	public static void exception_mth()throws UException {
		throw new UException();
	}
}
