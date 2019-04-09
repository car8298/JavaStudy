package ch04; // ∞≠ªÁ¥‘ «Æ¿Ã

public class Exam4_8_1 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
			int n = i;
			while (n > 0) {
				int n2 = n % 10;
				if (n2 == 3) {
					count += 1;
					System.out.println(i);
					break;
				}
				n = n / 10;
			}
		}
		System.out.println(count);
	}
}