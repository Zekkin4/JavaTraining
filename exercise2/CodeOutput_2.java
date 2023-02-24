package Exercise2;


	
	 
	 
public class CodeOutput_2 {
	 
	    public static void main(String args[]) {
	 
	        Sample1 s= new Sample1();s.mht1();
	 
	    }
	 
	}
	 
	 
	 
	class Sample{
	 
	    public void mht1() {
	 
	        mht2();
	 
	        System.out.println("caller");
	 
	    }
	 
	    
	 
	    public void mht2() {
	 
	        
	 
	        try {
	 
	            int a=1/0;
	 
	            return;    
	 
	        }
	 
	            
	 
	        catch(Exception e) {
	 
	            System.out.println("catch-mht2")
	 
	;        }
	 
	        finally {
	 
	            System.out.println("finally-mht2");
	 
	        }
	 
	    }
	 
	}

