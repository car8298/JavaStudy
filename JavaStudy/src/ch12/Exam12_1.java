package ch12;

import java.util.Scanner;

public class Exam12_1 {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		System.out.print("아이디를 입력해주세요. => ");
		Scanner s = new Scanner(System.in);
		String id = s.nextLine();

		boolean isUpper = false;
		boolean isLower = false;
		/* 반복문을 이용하여 문자열로부터 문자 꺼내오기 */
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
			System.out.println("입력하신 아이디는 " + id + " 입니다.");
			System.out.println("정상 가입되었습니다.");
		}
		else if(isUpper != true || isLower != true) {
			System.out.println("아이디를 입력해주세요. => " + id);
			System.out.println("아이디를 확인해주세요.");
		}
		s.close();
	}
}