package Ch21;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PWHandler implements ActionListener {
	private JTextField id;
	private JPasswordField pw;

	public PWHandler(JTextField id, JPasswordField pw) {
		this.id = id;
		this.pw = pw;
	}

	public void actionPerformed1(ActionEvent e) {
		System.out.println("ID : " + id.getText());
		System.out.println("PW : " + new String(pw.getPassword()));
		id.setText("");
		pw.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
