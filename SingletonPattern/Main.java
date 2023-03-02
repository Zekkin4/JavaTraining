package SingletonPattern;



public class Main {
	private static Main s;
	private Main() {
		System.out.println("Z");
	}
	public static Main create() {
		
		if(s == null) {
			s =   new Main();
		}
		return s;
	}
}
