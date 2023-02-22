package day2;
import java.util.*;
public class a20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int max;
		
		int a[][] = new int[row][col];
		
		for(int i=0;i<row;i++) 
			for(int j=0;j<col;j++) 
				a[i][j]=sc.nextInt();
		
		
		for(int i=0;i<row;i++) {
			max=a[i][0];
			for(int j=0;j<col;j++)
				if(max < a[i][j])
					max=a[i][j];
		
			System.out.println("Largest element in row "+i+" is "+max);
		}

	}

}
