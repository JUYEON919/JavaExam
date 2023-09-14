package ppt1;

public class MainClass {
   
	
   public static void main(String[] args) {
	   Calc myCalc = new Calc();
	   System.out.println(myCalc.add(10.5, 20.5));
   }
   
   public void test() {
	   
   }
}
class Calc{
	public int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	int add(int a, int b, int c) {
		int sum = a+b+c;
		return sum;
	}
	
	double add(double a, double b) {
		double sum = a+b;
		return sum;
	}
	
	double add(double a, double b, double c) {
		double sum = a+b+c;
		return sum;
	}
}