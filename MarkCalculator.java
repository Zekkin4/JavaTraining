package Exercise1;

class Student {
	
		 
	    String name;
	 
	    int rollNo;
	 
	 
	    Student() {
	 
	        name = "null";
	 
	        rollNo = 1;
	 
	    }
	 
	 
	    public void setDetails(String name, int rollNo) {
	 
	        this.name = name;
	 
	        this.rollNo = rollNo;
	 
	    }
	 
	}
	 
	 
	class Exam extends Student {
	 
	    int m1;
	 
	    int m2;
	 
	    int m3;
	 
	 
	    public void setMarks(int m1, int m2, int m3) {
	 
	        this.m1 = m1;
	 
	        this.m2 = m2;
	 
	        this.m3 = m3;
	 
	    }
	 
	}
	 
	 
	class Result extends Exam {
	 
	    public int totalMark() {
	 
	        int res = this.m1 + this.m2 + this.m3;
	 
	        return res;
	 
	    }
	}
	 
	
	 
	 public class MarkCalculator{
	
	 
	    public static void main(String[] args) {
	 
	        Result ex = new Result();
	 
	        ex.setDetails("Zorro", 124);
	 
	        ex.setMarks(80, 74, 90);
	 
	        System.out.println("The total marks of "+ex.name+" is "+ex.totalMark());
	 
	    }
	 
	}

