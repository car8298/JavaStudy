package Ch21;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exam21_3 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("��縸 ä��â");
		frame.setLayout(new FlowLayout());
		JTextArea area = new JTextArea(10, 20); // ��*�� 10*20
		area.setEditable(false); // ���� �Ұ�
		area.setFocusable(false); // ��Ŀ�� �Ұ�
		frame.add(area);

		/* JPanel ���� */
		JPanel panel = new JPanel();
		/* JTextField ���� */
		JTextField tf = new JTextField(13);
		panel.add(tf);
		
		/* JButton ���� */
		/* JTextField �� JButton�� JPanel�� �߰� */

		JButton btn = new JButton("����");
		btn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				String input = tf.getText();
				area.setText(input);
				tf.setText(" ");
				}

			@Override
			public void mouseEntered(MouseEvent arg0) {
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}});
		
		panel.add(btn, BorderLayout.EAST);
		frame.add(panel);
		frame.setSize(300, 260);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		/* JButton Ŭ�� �� �Էµ� ���ڸ� JTextArea�� ��� */
	}
}

