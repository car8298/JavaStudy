package ch04;

public class Exam4_8 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
			if ((i / 100) % 10 == 3 || (i / 10 ) % 10 == 3 || i % 10 == 3) {
				System.out.println(i + " : 3����");
				count++;
			} 
			// �ڵ� �ۼ�
		} System.out.println("�� ���� : " + count + "��");
	}
}