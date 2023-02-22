package Assignment;

public class a4 {
public static void main(String[] args) {
	int a=74,c=0;
	for(int i=2;i<a;i++){
		if(a%i==0) {
			System.out.println("Not a Prime");
			c=1;
		break;
		}
		
	}
	if(c==0)System.out.println("Prime");
		
	

}
}
