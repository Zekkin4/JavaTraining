package BridgePattern;

public interface BridgePatternDemo {
	public static void main(String[] args) {
		Color red = new Red();
		Shape triangle = new Triangle(red);
		triangle.applyColor();

		Color green = new Green();
		Shape circle = new Circle(green);
		circle.applyColor();
	}
}
