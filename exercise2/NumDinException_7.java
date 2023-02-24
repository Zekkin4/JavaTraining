package Exercise2;

import java.util.Scanner;

public class NumDinException_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n,d;
		while(true) {
			n=sc.nextLine();
			if( (n.equals("Q")) || (n.equals("q") )){
				System.exit(0);
			}
			d=sc.nextLine();
			int num = Integer.parseInt(n);
			int din = Integer.parseInt(d);
			try {
				
				
				System.out.println((float)num/din);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}

	}

}
