package ch05;

public class HomeWork {
	public static void main(String[] args) {
		// �迭 �Է�
		int[] stick = { 5, 4, 4, 2, 2, 8};
		// �ּҰ�, Ƚ�� ���� ����
		int min = 0;
		// �ּҰ� ã��
		for(int i = 0; i < stick.length; i++) {
			if(stick[i] < min || min == 0) {
			}	min = stick[i];
			} // �� ����⿡�� ª�� ����� ��ŭ �ڸ���
			for(int i = 0; i < stick.length; i++) {
				stick[i] = stick[i] - min;
				if(i >= 0
						)
					/*1. 0���� ū �迭 ����� ������ ���
					2 �迭 ����߿��� 0�� �����ϰ� ���� �ۿ� ���� ã�Ƴ�
					3. ���� ���� ���� ��� �迭 ��� ���� ����
					4. while(true)�� ����Ͽ� �ݺ��ϴٰ� �迭 ����� ������ 1���� �������� ����; */

				System.out.println(stick[i]);
		}

	}
}
