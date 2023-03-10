package BridgePattern;



public class Triangle extends Shape {
	 public Triangle(Color color) {
		    super(color);
		  }

		  @Override
		  void applyColor() {
		    System.out.println("Triangle filled with color");
		    color.applyColor();
		  }
}
