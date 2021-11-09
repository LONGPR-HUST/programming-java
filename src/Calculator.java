
public class Calculator {
	interface IntergerMath{
		int operation(int a, int b);
	}
	public int operateBinary(int a, int b, IntergerMath op) {
		return op.operation(a, b);
	}

	public static void main(String[] args) {
		Calculator myApp = new Calculator();
		IntergerMath addition = (a, b) -> a + b;
		IntergerMath subtraction = (a, b) -> a - b;
		System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
		System.out.println("20 - 10 = " + myApp.operateBinary(20, 10, subtraction));
	}

}
