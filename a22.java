package day2;

public class a22 {
public static void main(String[] args) {
	members obj = new members();
	obj.fn1(10);
	//obj.f2(20); Not accessable
	obj.fn3(30);
	obj.fn4(40);
}
}
class members{
	int a = 10;
	void fn1(int b) {
		System.out.println(a*b);
	}
	private int c = 10;
	private void fn2(int b) {
		System.out.println(c*b);
	}
	protected int d = 10;
	protected void fn3(int b) {
		System.out.println(d*b);
	}
	public int e = 10;
	public void fn4(int b) {
		System.out.println(e*b);
	}
}
