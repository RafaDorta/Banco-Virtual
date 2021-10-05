import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaVerificarContas {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVerificarContas window = new TelaVerificarContas();
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
	public TelaVerificarContas() {
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
			
					TelaGerente c = new TelaGerente();
					frame.setVisible(false);
					c.main(null);
				
				
			}
		});
		btnVoltar.setFont(new Font("Century", Font.PLAIN, 8));
		btnVoltar.setBounds(10, 11, 79, 24);
		frame.getContentPane().add(btnVoltar);
		
		JLabel lblNewLabel = new JLabel("N\u00B0 da Conta");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(303, 52, 88, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNome.setBounds(69, 52, 88, 14);
		frame.getContentPane().add(lblNome);
		
	}

}
