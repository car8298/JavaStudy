package ch07;

public class Member {
	static String id; // ���̵�
	String password; // ��й�ȣ
	String name; // �̸�
	int age; // ����

	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		if(a < 0 || a > 200) {
			System.out.println("�߸��� ���� �Դϴ�.");
			return;
		}
		age = a;
	} // �����ϳ��� set �޼ҵ�� get �޼ҵ尡 �ѽ����� �־����.
	
	public void setId(String i) {
		id = i;
	}
}
