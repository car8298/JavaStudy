package ch07;

public class Exam7_3 {
	public static void main(String[] args) {
		Class7_3.method1();
		/* Class7_3�� method1(new / static ) ȣ�� */
	}
}

class Class7_3 {
	int a;

	public static void method1() {
		System.out.println("method1 ���� ����");
		Class7_3 cc = new Class7_3();
		/* ?? */
		for (int i = 0; i < 5; i++) {
			cc.method2();
			/* method2�� ȣ���� �� �ֵ��� �ڵ� �ۼ� */
		}
		System.out.println("method1 ���� ����");
	}

	public void method2() {
		a++;
		System.out.println(a);
		
		/* �������� a�� ���� 1�� ���� */
		/* �������� a�� �� ��� */
	}
}