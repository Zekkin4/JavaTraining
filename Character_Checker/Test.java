package Character_Checker;



public class Test {
	public void check(String s) throws NotCharacter {
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
			try {
				if(charat(s.charAt(i))) {
					System.out.println("Character");
				}
				else {
					throw new NotCharacter();
				}
			}catch(Exception e) {
				
			System.out.println(e);
				
			}
			
		}
	}
	public boolean charat(char c) {
		
		return (Character.isAlphabetic(c));
			

	}
}
