package ch07;

import java.awt.Color;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {
	public static void main(String[] args) {
		Calendar c  = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		JFrame frame = new JFrame("������");

		JButton button = new JButton();
		button.setText("Button");
		button.setBackground(Color.magenta);
		frame.add(button);
		
		frame.setSize(200, 200);
		frame.setResizable(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ����� �빮�ڷθ� ǥ�� �ϴ°�  ��Ģ

		frame.setVisible(true);
	}
}