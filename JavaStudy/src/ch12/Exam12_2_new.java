package ch12;

public class Exam12_2_new {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		String msg = "Cyqw amkc, cyqw em";
		int leng = msg.length();
		for (int i = 0; i < leng; i++) {
			char idex = msg.charAt(i);
			if (idex >= ASCII_A && idex <= ASCII_Z || idex >= ASCII_a && idex < ASCII_z) {
				System.out.print((char) (idex + 2));
			}
			else if((idex) > ASCII_Z) {
				System.out.println((char)(idex - 26));
			}
		}
	}
}