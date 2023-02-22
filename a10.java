package Assignment;

import java.util.Scanner;

public class a10 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int r,c,t=1;
		
		r=sc.nextInt();
		c=sc.nextInt();
		int a[][] = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=t++;
				System.out.printf("% 3d",a[i][j]);
			}
			System.out.println();
		}
		
	
	}
}
