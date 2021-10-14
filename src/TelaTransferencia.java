import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaTransferencia {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTransferencia window = new TelaTransferencia();
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
	public TelaTransferencia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 477, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnVoltar = new JButton("<-- VOLTAR");
		btnVoltar .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaGerente.main(null);
			}
		});
		btnVoltar.setFont(new Font("Century", Font.PLAIN, 8));
		btnVoltar.setBounds(10, 11, 79, 24);
		frame.getContentPane().add(btnVoltar);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(141, 99, 182, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(141, 155, 182, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("*-*-*  CONTA DO DESTINATARIO  *-*-*  ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(85, 130, 295, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("*-*-*  CONTA DO REMETENTE  *-*-*  ");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(95, 74, 275, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("VALOR");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(204, 186, 57, 24);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(167, 210, 130, 20);
		frame.getContentPane().add(textField_2);
		
		btnNewButton = new JButton("TRANSFERIR");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(167, 262, 130, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
