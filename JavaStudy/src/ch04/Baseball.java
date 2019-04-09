package ch04;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		Number n = new Number();
		int number = n.get();
		
		int baseball3 = number % 10;
		int baseball2 = (number / 10) % 10;
		int baseball1 = (number / 10 / 10) % 10;

		Scanner s = new Scanner(System.in);
		int inputNumber1 = s.nextInt();
		int inputNumber2 = s.nextInt();
		int inputNumber3 = s.nextInt();
		
		int strike = 0; // 스트라이크를 개수를 저장할 변수
		int ball = 0; // 볼의 개수를 저장할 변수
		int 아웃 = 0; // 아웃개수를 저장할 변수
		
		if(baseball1 == inputNumber1) {
			strike += 1;
		} else if(baseball1 == inputNumber2 
				|| baseball1 == inputNumber3) {
			ball++; 
		} else { 아웃 ++; }
		
		if(baseball2 == inputNumber2) {
			strike++;
		} else if(baseball2 == inputNumber1 
				|| baseball2 == inputNumber3) {
			ball++;
		} else { 아웃 ++; }
		
		if(baseball3 == inputNumber3) {
			strike = strike + 1;
		} else if(baseball3 == inputNumber1 
				|| baseball3 == inputNumber2) {
			ball++;
		} else { 아웃 ++; }
		
		// if(strike == 0 && ball == 0) {System.out.println {" 아웃  "} ;
		
		System.out.println("스트라이크 => " + strike);
		System.out.println("볼 => " + ball);
		System.out.println("아웃=> " + 아웃);
		
	}	
}

class Number {
	public int get() {
		int number = 0;
		try {
			URL url = new URL("http://ggoreb.com/kopo/baseball.txt");
			URLConnection urlConnection = url.openConnection();
			InputStream in = urlConnection.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader reader = new BufferedReader(isr);
			StringBuffer response = new StringBuffer();
			String data = null;
			while ((data = reader.readLine()) != null) {
				response.append(data);
			}
			number = Integer.parseInt(response.toString());
			reader.close();
			isr.close();
			in.close();
		} catch (Exception e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
		return number;
	}
}