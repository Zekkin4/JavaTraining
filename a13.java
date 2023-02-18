package Assignment;

import java.util.Scanner;

public class a13 {
public static void main(String[] args) {
	int s=0,input;
	Scanner sc= new Scanner(System.in);
	input = sc.nextInt();
	sc.close();
	
	int a[][]=new int[][] {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
	for(int i=0;i<5;i++) {
		s+=a[input-1][i];
	}
	System.out.println(s);
}
}
