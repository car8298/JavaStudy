package Ch21;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing1 {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setLayout(new FlowLayout()); // 요소 배치 설정
		
		JButton b1 = new JButton("버튼 1");
		JButton b2 = new JButton();
		b2.setText("버튼2");
		
		j.add(b1); j.add(b2); // 버튼추가
		
		// 크기 지정(w, h)
		j.setSize(200,  100);
		
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 보이기
		j.setVisible(true);
	}
}
