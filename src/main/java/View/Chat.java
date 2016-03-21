package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class Chat {

	private JFrame frmChatVia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chat window = new Chat();
					window.frmChatVia.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Chat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmChatVia = new JFrame();
		frmChatVia.setTitle("CHAT - VIA SOCKET - MATHEUS");
		frmChatVia.setBounds(100, 100, 450, 300);
		frmChatVia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChatVia.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 11, 414, 210);
		frmChatVia.getContentPane().add(textPane);
		
		JButton btnNewButton = new JButton("ENVIAR");
		btnNewButton.setBounds(10, 232, 141, 23);
		frmChatVia.getContentPane().add(btnNewButton);
	}
}
