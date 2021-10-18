import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaTransferencia {

	private JFrame frame;
	private JTextField textEnvia;
	private JTextField textRecebe;
	private JTextField textValor;
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
		
		textEnvia = new JTextField();
		textEnvia.setColumns(10);
		textEnvia.setBounds(141, 99, 182, 20);
		frame.getContentPane().add(textEnvia);
		
		textRecebe = new JTextField();
		textRecebe.setColumns(10);
		textRecebe.setBounds(141, 155, 182, 20);
		frame.getContentPane().add(textRecebe);
		
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
		
		textValor = new JTextField();
		textValor.setColumns(10);
		textValor.setBounds(167, 210, 130, 20);
		frame.getContentPane().add(textValor);
		
		btnNewButton = new JButton("TRANSFERIR");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Menu.transfere(Integer.parseInt(textEnvia.getText()), Integer.parseInt(textRecebe.getText()),Double.parseDouble(textValor.getText()))) {
					JOptionPane.showMessageDialog(null, "Dinheiro Transferido para Conta: " + Integer.parseInt(textRecebe.getText()));
					frame.setVisible(false);
					TelaGerente.main(null);	
				}
				
			}
		});
		btnNewButton.setBounds(167, 262, 130, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
