package Exercise1;

	class ParentClass1 {
	    ParentClass1() {
	        System.out.println("Constructor of Parent Class 1!");
	    }
	}
	
	class ParentClass2{
	    ParentClass2() {
	        System.out.println("Constructor of Parent Class 2!");
	    }
	}
	 
	class ChildClass extends ParentClass1 {
	    ParentClass2 obj = new ParentClass2();
	} 
	public class ConstructerSequence {
	    public static void main(String[] args) {
	        ChildClass object = new ChildClass();
	    }
	}
	 
	 
	
	 
	 
	
	 
	 
	

