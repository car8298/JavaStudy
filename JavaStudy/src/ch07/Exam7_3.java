package ch07;

public class Exam7_3 {
	public static void main(String[] args) {
		Class7_3.method1();
		/* Class7_3의 method1(new / static ) 호출 */
	}
}

class Class7_3 {
	int a;

	public static void method1() {
		System.out.println("method1 실행 시작");
		Class7_3 cc = new Class7_3();
		/* ?? */
		for (int i = 0; i < 5; i++) {
			cc.method2();
			/* method2를 호출할 수 있도록 코드 작성 */
		}
		System.out.println("method1 실행 종료");
	}

	public void method2() {
		a++;
		System.out.println(a);
		
		/* 전역변수 a의 값을 1씩 증가 */
		/* 전역변수 a의 값 출력 */
	}
}