package Ch21;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing2 {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setLayout(new FlowLayout()); // ��� ��ġ ����
		
		MouseListener ml = new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseClicked(MouseEvent e) {
				JButton b = (JButton) e.getSource(); // ��ư
				String text = b.getText();
				System.out.println(text);
				
			}
		};
		
		JButton b1 = new JButton("��ư 1");
		b1.addMouseListener(ml);
		JButton b2 = new JButton();
		b2.setText("��ư 2");
		b2.addMouseListener(ml);
		
		j.add(b1); j.add(b2); // ��ư�߰�
		
		// ũ�� ����(w, h)
		j.setSize(200,  100);
		
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ���̱�
		j.setVisible(true);
	}
}
