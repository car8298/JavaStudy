package ch12;

import java.util.Scanner;

public class Exam12_1 {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		System.out.print("���̵� �Է����ּ���. => ");
		Scanner s = new Scanner(System.in);
		String id = s.nextLine();

		boolean isUpper = false;
		boolean isLower = false;
		/* �ݺ����� �̿��Ͽ� ���ڿ��κ��� ���� �������� */
		int leng = id.length();
		for(int i = 0; i < leng; i++) {
			char idex = id.charAt(i);
			if(idex >= ASCII_A && idex <= ASCII_Z) {
				isUpper = true;
			}
			else if(idex >= ASCII_a && idex <= ASCII_z) {
				isLower = true;
			}
		}
		if(isUpper == true && isLower == true) {
			System.out.println("�Է��Ͻ� ���̵�� " + id + " �Դϴ�.");
			System.out.println("���� ���ԵǾ����ϴ�.");
		}
		else if(isUpper != true || isLower != true) {
			System.out.println("���̵� �Է����ּ���. => " + id);
			System.out.println("���̵� Ȯ�����ּ���.");
		}
		s.close();
	}
}