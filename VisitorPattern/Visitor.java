package VisitorPattern;

public interface Visitor {
	 public abstract void visit(FuelTank fuelTank);
	 public abstract void visit(Engine engine);
	 public abstract void visit(Bike bike);
	}
