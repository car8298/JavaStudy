package ch06;

public class Exam6_1 {
	public static void main(String[] args) {
		int result1 = plus(5, 3);
		System.out.println("plus => " + result1);

		int result2 = minus(5, 3);
		System.out.println("minus => " + result2);
	}

	public static int plus(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
		
		// 内靛 累己
	}

	public static int minus(int num1, int num2) {
		int decrease = num1 - num2;
		return decrease;
		// 内靛 累己
	}
}