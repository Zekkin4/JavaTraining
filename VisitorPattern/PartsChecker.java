package VisitorPattern;

public class PartsChecker implements Visitor {
	 @Override
	 public void visit(FuelTank fuelTank) {
	 System.out.println( "Checking whether there is fuel in fuel tank");
	 }
	 @Override
	 public void visit(Engine engine) {
	 System.out.println( "Checking whether ignition switch is on");
	 }
	 @Override
	 public void visit(Bike bike) {
	 System.out.println("Going to the bike");

	 }
}
