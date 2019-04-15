package Ch21;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Exam21_2 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("모양만 계산기");
		frm.setBounds(100, 100, 220, 300); // 윈도우 크기 지정
		frm.setLayout(new BorderLayout()); // 정렬방식
		//String[] datas = { "9", "8", "7", "6", "5", "4", "3", "2", "1" };
		JLabel label = new JLabel();
		label.setText("TEST");
		/* 오른쪽 정렬 */
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		frm.add(label, BorderLayout.NORTH);

		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(3, 3));
		MouseListener ml = new MouseListener() 
		{

			@Override
			public void mouseClicked(MouseEvent e) {
				JButton btn = (JButton)e.getComponent();
				String text = btn.getText();	
				
				label.setText(label.getText() + text);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			
			}
				
		};
	
		
		for (int i = 9; i >= 1 ; i--) {
			JButton btn = new JButton(i + "");
			btn.addMouseListener(ml);
			panel1.add(btn);
		}
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1, 4));
		panel2.add(new JButton("+"));
		panel2.add(new JButton("-"));
		panel2.add(new JButton("x"));
		panel2.add(new JButton("/"));

		/* JPanel1 추가 */
		/* JPanel2 추가 */

		frm.add(panel1, BorderLayout.CENTER);
		frm.add(panel2, BorderLayout.SOUTH);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
