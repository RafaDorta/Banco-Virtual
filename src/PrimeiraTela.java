import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class PrimeiraTela {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeiraTela window = new PrimeiraTela();
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
	public PrimeiraTela() {
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
		
		JLabel lblNewLabel = new JLabel("Deseja entrar como?");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(45, 81, 144, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BEM-VINDO A CENTRAL DO BANCO JURA");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_1.setBounds(35, 24, 416, 46);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("GERENTE");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(147, 133, 153, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					TelaInicialG c = new TelaInicialG();
					frame.setVisible(false);
					c.main(null);
						
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCliente = new JButton("CLIENTE");
		btnCliente.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					TelaInicial c = new TelaInicial();
					frame.setVisible(false);
					c.main(null);
						
			}
		});
		
		
		btnCliente.setBounds(147, 183, 153, 23);
		frame.getContentPane().add(btnCliente);
		
		
		
	}
}
