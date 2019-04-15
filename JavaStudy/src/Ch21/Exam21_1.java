package Ch21;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam21_1 {
	public static void main(String[] args) {
		String[] datas = { "A", "B", "C", "D", "E", "F", "G" };
		JFrame frm = new JFrame();
		frm.setBounds(120, 120, 300, 200);
		frm.setLayout(new GridLayout(3, 4));
		
		for(String s : datas) {
			frm.add(new JButton(s));
		}
		
		//for(int i = 0; i < datas.length; i++)
		//	frm.add(new JButton(datas[i]));
		/* JFrame의 Layout을 GridLayout 으로 지정 */
		//frm.add(new JButton(datas[0]));
		//frm.add(new JButton(datas[1]));
		//frm.add(new JButton(datas[2]));
		//frm.add(new JButton(datas[3]));
		//frm.add(new JButton(datas[4]));
		//frm.add(new JButton(datas[5]));
		//frm.add(new JButton(datas[6]));
		/* 배열을 이용하여 JButton 으로 표현 */
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
