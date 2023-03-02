package StrategPattern;



public class StrategyPattern {
	public static void main(String[] args) {
		 
	    Context context = new Context(new AdditionStrategy());
	    System.out.println("Result: " + context.executeStrategy(3, 4));

	    context = new Context(new SubtractionStrategy());
	    System.out.println("Result: " + context.executeStrategy(3, 4));
	  
}
}
