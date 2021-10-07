import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaCriarConta {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCriarConta window = new TelaCriarConta();
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
	public TelaCriarConta() {
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
		
		JLabel lblNewLabel = new JLabel("CONTA :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(188, 43, 79, 24);
		frame.getContentPane().add(lblNewLabel);
		
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
		
		JButton btnNewButton = new JButton("Poupanca");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(161, 97, 134, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCorrente = new JButton("Corrente");
		btnCorrente.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnCorrente.setBounds(161, 144, 134, 23);
		frame.getContentPane().add(btnCorrente);
		
		JButton btnEspecial = new JButton("Especial");
		btnEspecial.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnEspecial.setBounds(161, 191, 134, 23);
		frame.getContentPane().add(btnEspecial);
	}

}
