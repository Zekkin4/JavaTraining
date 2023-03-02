package VisitorPattern;

public class FuelTank implements Visitable {
	 public void accept(Visitor visitor) {
	 visitor.visit(this);
	 }
	}