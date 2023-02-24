package Exercise2;

import java.util.Scanner;

public class MarkException_8 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
int a=0,n;
String s;
for(int i=1;i<=10;) {
	try {
		System.out.println("Enter Mark for Student "+i);
		s=sc.next();
		n=Integer.parseInt(s);
		a+=n;
		i++;
	}catch(Exception e) {
		System.out.println(e);
		System.out.println("Enter Valid Input");
	}
}
System.out.println("Total :"+a);

}
}
