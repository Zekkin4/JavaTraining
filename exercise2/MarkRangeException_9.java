package Exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MarkRangeException_9 {
public static void main(String[] args) throws RangeException {
	Scanner sc = new Scanner(System.in);
	int a=0,n=0;
	String s;
	for(int i=1;i<=10;) {
		try {
			System.out.println("Enter Mark for Student "+i);
			//s=sc.next();
			a=sc.nextInt();
			
			if(a<0 || a>100) {
				throw new RangeException();
			}
			n+=a;
			i++;
		}catch(RangeException e) {
			e.printStackTrace();
			System.out.println(e);
		}catch(InputMismatchException e) {
			sc.next();
			e.printStackTrace();
			System.out.println("Enter Valid Input");
		}
}
}
}
class RangeException extends Exception {
	public RangeException() {
		System.out.println("Out of Boundary");
	}
	
}
