package day2;

public class a2_5 {
	public static void main(String[] args) {
		C obj1 = new C();
		C obj2 = new C();
		C obj3 = new C();
		C obj4 = new C();
		System.out.println("No of Objects = "+ C.i);
	}
}
	 class C {
		 static int i;
		 public C() {
			i++;
		}
	}

