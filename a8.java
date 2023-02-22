package Assignment;
import java.util.*;
public class a8 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a[]= {1,4,6,2,94,9,8,3};
		loc(a);
		
	}
	public static void loc(int a[]) {
		int l= sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]==l) {
				System.out.println(i);
			   return ;
			}
		}
		System.out.println("NOPE");
	}
}
