package myJavaApp;

public class Calculator {

	public int Calculate(int a, int b){
		int total = a +b;
		return  total;	
	}
	public int Calculate(int a, int b, int c){
		int total = a + b + c;
		return total;
	}
	
	public int Calculate(int a, int b, int c, int d){
		int total = a + b + c + d;
		return total;
	}
	public int Calculate(int a, int b, int c, int d, int e){
		int total = a + b + c + d + e;
		return total;
}
}