package ch04;

public class Exam4_star {
	public static void main(String[] args) {
		int leftSpace = 7 / 2; // 2
		int rightSpace = 5;
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (leftSpace >= j || rightSpace <= j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			if (i > (7 / 2)) {
				leftSpace = leftSpace + 1;
				rightSpace = rightSpace - 1;
			} else {
				leftSpace = leftSpace - 1;
				rightSpace = rightSpace + 1;
			}
			System.out.println();
		}

	}
}
