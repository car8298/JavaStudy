package Ch21;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing1 {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setLayout(new FlowLayout()); // ��� ��ġ ����
		
		JButton b1 = new JButton("��ư 1");
		JButton b2 = new JButton();
		b2.setText("��ư2");
		
		j.add(b1); j.add(b2); // ��ư�߰�
		
		// ũ�� ����(w, h)
		j.setSize(200,  100);
		
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ���̱�
		j.setVisible(true);
	}
}