import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TelaExtrato {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, int conta) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExtrato window = new TelaExtrato(conta);
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
	public TelaExtrato(int conta) {
		initialize(conta);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int conta) {
		frame = new JFrame();
		frame.setBounds(100, 100, 477, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnVoltar = new JButton("<-- VOLTAR");
		btnVoltar .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaCliente.main(null);
			}
		});
		btnVoltar.setFont(new Font("Century", Font.PLAIN, 7));
		btnVoltar.setBounds(10, 11, 79, 24);
		frame.getContentPane().add(btnVoltar);
		
		JLabel lblNewLabel = new JLabel("EXTRATO:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(192, 53, 96, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea textExtrato = new JTextArea();
		textExtrato.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textExtrato.setBounds(104, 78, 273, 214);
		textExtrato.setText(Menu.verificaExtratoCliente(conta));
		frame.getContentPane().add(textExtrato);
		
		JScrollPane scrollPane = new JScrollPane(textExtrato);
		scrollPane.setToolTipText("");
		scrollPane.setBounds(80, 90, 302, 153);
		frame.getContentPane().add(scrollPane);
	
	}
}
