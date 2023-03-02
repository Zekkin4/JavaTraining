package BuilderPattern;



public class BuilderPatternn {
	public static void main(String[] args) {
		User user = new User.UserBuilder("John", "Doe")
	            .age(30)
	            .phone("1234567890")
	            .address("Fake address 1234")
	            .build();

	System.out.println(user.getFirstName());
	System.out.println(user.getLastName());
	System.out.println(user.getAge());
	System.out.println(user.getPhone());
	System.out.println(user.getAddress());
	}
}
