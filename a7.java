package Assignment;

public class a7 {
	public static void main(String[] args) {
		int a[] = {1,3,5,7,9,2,4,6,8};
		asc(a);
	}
	public static void asc(int []a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j])
					a[i]=a[j]+a[i]-(a[j]=a[i]);
		
			}
		}
		for(int i:a)
			System.out.print(i+" ");
	}
}
