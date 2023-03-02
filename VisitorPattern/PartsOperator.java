package VisitorPattern;

public class PartsOperator implements Visitor {
	 @Override
	 public void visit(FuelTank fuelTank) {
	 System.out.println("Releasing fuel from fuel tank to Engine");
	 }
	 @Override
	 public void visit(Engine engine) {
	 System.out.println("Accepting fuel from fuel tank and running engine");
	 }
	 @Override
	 public void visit(Bike bike) {
	 System.out.println("Now going to start bike");

	 }
	}