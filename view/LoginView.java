package project_1.view;

import project_1.event.LoginEvt;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Login ȭ�� Ŭ����
 * 
 * @author user
 *
 */
@SuppressWarnings("serial")
public class LoginView extends JFrame {

	private JTextField jtfId;
	private JPasswordField jpfPw;
	private JButton jbtLogin;

	public LoginView() {
		super("�α���");

		JLabel jlbLogin = new JLabel("ID : ");
		JLabel jlbPassword = new JLabel("PW : ");

		jtfId = new JTextField(10);
		jpfPw = new JPasswordField(10);
		jbtLogin = new JButton("Login");

		setLayout(null);

		// ������Ʈ ��ǥ ����
		jlbLogin.setBounds(30, 30, 50, 30);
		jtfId.setBounds(80, 30, 80, 30);
		jlbPassword.setBounds(30, 80, 50, 30);
		jpfPw.setBounds(80, 80, 80, 30);
		jbtLogin.setBounds(200, 35, 70, 70);

		add(jlbLogin);
		add(jtfId);
		add(jlbPassword);
		add(jpfPw);
		add(jbtLogin);
		LoginEvt le = new LoginEvt(this);
		jbtLogin.addActionListener(le);

		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// LoginTest

	// getter

	public JTextField getJtfId() {
		return jtfId;
	}

	public JPasswordField getJpfPw() {
		return jpfPw;
	}

	public JButton getJbtLogin() {
		return jbtLogin;
	}

	// main
//	public static void main(String[] args) {
//		new Login();
//	}
}// class