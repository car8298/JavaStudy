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
					/*1. 0보다 큰 배열 요소의 갯수를 출력
					2 배열 요소중에서 0을 제외하고 가장 작운 수를 찾아냄
					3. 가장 작은 수로 모든 배열 요소 값을 감소
					4. while(true)를 사용하여 반복하다가 배열 요소의 개수가 1개가 남았을때 종료; */

				System.out.println(stick[i]);
		}

	}
}
