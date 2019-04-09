package ch04;

public class Exam4_8 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
			if ((i / 100) % 10 == 3 || (i / 10 ) % 10 == 3 || i % 10 == 3) {
				System.out.println(i + " : 3포함");
				count++;
			} 
			// 코드 작성
		} System.out.println("총 개수 : " + count + "개");
	}
}