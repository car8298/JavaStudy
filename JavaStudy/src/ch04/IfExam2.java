package ch04;

public class IfExam2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		if (a++ == 10 && a == 11) {
			System.out.println("1번");
		}

		System.out.println("a : " + a);

		if (--a == 10 || ++b == 21) { // or연산자는 하나만 만족하면 다른건 실행하지 않음. --a == 10이 참이기 때문에 ++b는 실행 x
			System.out.println("2번");
		}

		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
}