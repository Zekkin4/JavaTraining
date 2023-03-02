package StrategPattern;



public interface Strategy {
	  int doOperation(int num1, int num2);
	}

		class AdditionStrategy implements Strategy {
		  @Override
		  public int doOperation(int num1, int num2) {
		    return num1 + num2;
		  }
		}

		class SubtractionStrategy implements Strategy {
		  @Override
		  public int doOperation(int num1, int num2) {
		    return num1 - num2;
		  }
		}

