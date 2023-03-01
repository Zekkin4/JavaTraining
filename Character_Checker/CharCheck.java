package Character_Checker;

import java.util.Scanner;

public class CharCheck {
	public static void main(String[] args) throws NotCharacter {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println();
		s = sc.next();
		Test t = new Test();
		t.check(s);
	}

}
