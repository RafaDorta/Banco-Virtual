import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class TelaVerificaInfos {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, int conta) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVerificaInfos window = new TelaVerificaInfos(conta);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaVerificaInfos(int conta) {
		initialize(conta);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int conta) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textArea.setText(Menu.verificaInfosConta(conta));
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("Informa\u00E7\u00F5es da Conta");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(150, 31, 180, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setToolTipText("");
		scrollPane.setBounds(70, 66, 302, 153);
		frame.getContentPane().add(scrollPane);
	}
}
