package ch04;

public class Gugudan1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(
						j + " * " + i + " = " + (i * j) + "\t");
			}
			System.out.println(); // 줄바꿈, i와 j의 위치변경으로 인한 단수끼리 모음, 등등 연습 해 볼 것.
		}
	}
}