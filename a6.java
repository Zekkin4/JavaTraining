package Assignment;
import java.util.*;
public class a6 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a[] =new int[] {1,2,3,4,5,6,7,8};
	    resize(a);
		
			
		
	}
	public static void resize(int[] a) {
		int s = sc.nextInt();
		int r[]= new int[s];
		for(int i=0;i<s;i++) {
			if(s<a.length)
			r[i]=a[i];
			else r[i]=0;
			System.out.print(i+" ");
		}
		
	}
}
