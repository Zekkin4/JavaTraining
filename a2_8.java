package day2;

public class a2_8 {
	public static void main(String[] args) {
		
		        SingletonClass S ;
		        S= Singleton.createInstance();
		      
		    }
		}

		class SingletonClass{
		    private static Singleton Obj = null;

		    private Singleton(){

		    }

		    public static Singleton createInstance(){
		        if(Obj == null){
		            Obj = new Singleton();
		        }
		        Obj.message();
		        return Obj;
		       
		    }

		    private void message(){
		        System.out.println("Object created once");
		    }

		    

		
	}

