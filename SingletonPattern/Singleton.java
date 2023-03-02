package SingletonPattern;



public class Singleton {
	public static void main(String[] args) {
		Main s = Main.create();
		Main z = Main.create();
		System.out.println(s);
		System.out.println(z);
	}
}
