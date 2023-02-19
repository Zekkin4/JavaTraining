package day2;

public class a2_1 {
	static char  c = 'z';
	static int i = 4;
	static int[] a = {1,2,3,4,5};
	static String S = "Zorro";
	
	public static void main(String[] args) {
		System.out.println("Before\n");
		System.out.println("char "+c+", int "+i+", array a[2] "+ a[2]+"Object "+S+"\n");
		
		pass(c,i,a,S);
		System.out.println("After\n");
		System.out.println("char "+c+", int "+i+", array a[2] "+ a[2]+"Object "+S);
		
	}
	public static void pass(char c , int i,int[] a,String S) {
		c='A';
		i=4+5;
		a[2]=2;
		S="Madara";
		
		
	}

}
