package Assignment;
import java.util.*;
public class a5 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		avg();
	}
	public static void avg() {
		int a=0,b=0;
		b=sc.nextInt();
		
		for(int i=0;i<b;i++) 
			a+=sc.nextInt();
		
		System.out.println(a);
		sc.close();
	}
	
	
}
