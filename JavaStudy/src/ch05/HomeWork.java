package ch05;

public class HomeWork {
	public static void main(String[] args) {
		// 배열 입력
		int[] stick = { 5, 4, 4, 2, 2, 8};
		// 최소값, 횟수 변수 선언
		int min = 0;
		// 최소값 찾기
		for(int i = 0; i < stick.length; i++) {
			if(stick[i] < min || min == 0) {
			}	min = stick[i];
			} // 각 막대기에서 짧은 막대기 만큼 자르기
			for(int i = 0; i < stick.length; i++) {
				stick[i] = stick[i] - min;
				if(i >= 0
						)

				System.out.println(stick[i]);
		}

	}
}
