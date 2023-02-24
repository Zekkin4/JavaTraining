package Exercise2;

public class ConstException_6 extends Exception {
	 ConstException_6()throws Exception {
		throw new Exception();
		
	}
	
	public static void main(String[] args) throws Exception {
		
			Child child=new Child();
	}
	 
}
class Child extends ConstException_6{
	Child() throws Exception{
		
		
		try {
			
		}
		catch(Exception e) {
			System.out.println("Hello");
		}
		
	}
}

