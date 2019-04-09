package ch03;

public class Exam03_07 {
	public static void main(String[] args) {
		int num = 12345;
		int total = 0;
		while(num > 0) {
			int num1 = num % 10;
			num = num / 10;
			total += num1;
		}
		
		/*int num1 = num % 10;
		num = num / 10;

		int num2 = num % 10;
		num = num / 10;
		
		int num3 = num % 10;
		num = num / 10;
		
		int num4 = num % 10;
		num = num / 10;
		
		int num5 = num % 10;
		num = num / 10;
		
		int num1 = num % 12340;
		num = num / 10;
		int num2 = num % 1230;
		num = num / 10;
		int num3 = num % 120;
		num = num / 10;
		int num4 = num % 10;
		num = num / 10;
		int num5 = num; */

		System.out.println("각 자리 숫자의 합 : " + total);
	}
}
