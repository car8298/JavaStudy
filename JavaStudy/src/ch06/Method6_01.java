package ch06;

public class Method6_01 {	
	public static char sum(int a, char c) {
		//System.out.println(2);
		char trans = (char)(c + a);
		//System.out.println(trans); // return Ÿ���� void >> char�� �ٲ�
		return trans;
	}

	public static void main(String[] args) {
		// fmnc
		// System.out.println(1);
		
		System.out.println(sum(2, 'f'));
		System.out.println(sum(2, 'm'));
		System.out.println(sum(2, 'n'));
		System.out.println(sum(2, 'c'));
		// System.out.println(3);
	} //������ ������ ��.
}
