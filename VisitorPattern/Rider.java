package VisitorPattern;

public class Rider {
	 public static void main(String args[]) {
	 Bike bike = new Bike();
	 Visitable engine = new Engine();
	 Visitable fuelTank = new FuelTank();

	 bike.addBikePart(fuelTank);
	 bike.addBikePart(engine);
	 bike.accept(new PartsChecker());
	 bike.accept(new PartsOperator());

	 }
}
