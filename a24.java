package day2;

public class a24 {
public static void main(String[] args) {
	Cs obj = new Cs();
	obj.noParameter();
	obj.parameter(1,4,6,88);
	obj.modifier(2, 40, 10);
}
}
class Cs{
	static int a=1,b=1,c=1,d;
	void noParameter() {
		System.out.println(a*d*d+b*d+c);
	}
	void parameter(int a, int b, int c , int d) {
		System.out.println(a*d*d+b*d+c);
	}
	void modifier(int e, int f, int g) {
		int a=e*10, b=f*10, c=g*15;
		System.out.println(a*d*d+b*d+c);
	}
	int e,f,g;
	int fn1() {
		return e;
	}
	int fn2() {
		return f;
	}
	int fn3() {
		return g;
	}
}
