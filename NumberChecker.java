package Exercise1;

public class NumberChecker {
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			if(amstrong(i))
				System.out.println(i+" Amstrong");
			else if(perfectNum(i))
				System.out.println(i+" Perfect Number");
			else if(palindrome(i))
				System.out.println(i+" palindrome");
			else if(prime(i))
				System.out.println(i+" Prime");
			else System.out.println(i+" None of these");
		}
	}
	public static boolean amstrong(int n) {
		int c = (int)Math.log10(n)+1;
		int v=n;
		int t=n,g=0;
		
		while(v!=0) {
			t=v%10;
			v=v/10;
			g+=Math.pow(t, c);
			
		}
		if(n==g)
			return true;
		
		return false;
	}
	public static boolean perfectNum(int n) {
		int c=0;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				c+=i;
			}
		}
		if(c==n) {
			
			return  true;
		}
		
		return false;
	}
	public static boolean palindrome(int n) {
		int v=n;
		int t=n,g=0;
		
		while(v!=0) {
			t=v%10;
			v=v/10;
			g=t+g*10;
		}
		if(g==n) {
			return true;
		}
		
		return false;
	}
	public static boolean prime(int n) {
		int c=0;
		for(int i=2;i<n/2;i++) {
			if(n%i==0)
				c++;
		}
		if(c==0) {
			return true;
		}
		
		return false;
	}

}
