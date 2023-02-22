package Exercise1;

public class Singleton {
	public static void main(String[] args) {
		
		
		        Singleton1 S ;
		        S= Singleton1.createInstance();
		        

		    }
		}

		class Singleton1 {
		    private static Singleton1 Obj = null;

		    private Singleton1(){

		    }

		    public static Singleton1 createInstance(){
		        if(Obj == null){
		            Obj = new Singleton1();
		        }
		        Obj.message();
		        return Obj;
		       
		    }

		    private void message(){
		        System.out.println("Object created only once");
		    }

		    

		
	}

