package ch07;

public class Member {
	static String id; // 아이디
	String password; // 비밀번호
	String name; // 이름
	int age; // 나이

	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		if(a < 0 || a > 200) {
			System.out.println("잘못된 나이 입니다.");
			return;
		}
		age = a;
	} // 변수하나당 set 메소드와 get 메소드가 한쌍으로 있어야함.
	
	public void setId(String i) {
		id = i;
	}
}
