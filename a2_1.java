package day2;

public class a2_1 {
	int x;
	
	public static void main(String[] args) {
		char  c = 'z';
		int i = 4;
		int[] a = {1,2,3,4,5};
		a2_1 obj = new a2_1();
		
		System.out.println("Before\n");
		System.out.println("char "+c+", int "+i+", array a[2] "+ a[2]+" Object "+obj.x+"\n");
		
		pass(c,i,a,obj);
		System.out.println("After\n");
		System.out.println("char "+c+", int "+i+", array a[2] "+ a[2]+" Object "+obj.x);
		
	}
	public static void pass(char c , int i,int[] a,a2_1 obj) {
		c='A';
		i=4+5;
		a[2]=2;
		obj.x = 4;;
		
		
	}

}
