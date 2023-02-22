package Exercise1;

public class ParameterPassing {
	int x;
	
	public static void main(String[] args) {
		char  Char = 'z';
		int Int = 4;
		int[] Array = {1,2,3,4,5};
		ParameterPassing obj = new ParameterPassing();
		
		System.out.println("Before\n");
		System.out.println("char "+Char+", int "+Int+", array a[2] "+ Array[2]+" Object "+obj.x+"\n");
		
		pass(Char,Int,Array,obj);
		System.out.println("After\n");
		System.out.println("char "+Char+", int "+Int+", array a[2] "+ Array[2]+" Object "+obj.x);
		
	}
	public static void pass(char c , int i,int[] a,ParameterPassing obj) {
		c='A';
		i=4+5;
		a[2]=2;
		obj.x = 4;;
		
		
	}

}
