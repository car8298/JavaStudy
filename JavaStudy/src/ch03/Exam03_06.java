package ch03;

import java.util.Scanner;

public class Exam03_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("2자리수 정수 입력(10~99)>>");
		int n = scanner.nextInt();
		boolean isMatch = false;
		int hundred = 0;
		int ten = 0; // 10의 자리 수를 저장할 변수
		int one = 0; // 1의 자리 수를 저장할 변수
		 // 두 자리 수 비교 값을 저장할 변수
		
		hundred = n / 100;
		ten = n / 10;
		one = n % 10;
		
		isMatch = ten == one;
		
		System.out.println(isMatch);
		scanner.close();
		
		
	}
}
