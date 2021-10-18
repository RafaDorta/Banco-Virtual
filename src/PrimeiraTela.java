import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;


public class PrimeiraTela {
	
	private JFrame frame;
	ImageIcon logo = new ImageIcon(getClass().getResource("Jura.png"));
	ImageIcon fundo = new ImageIcon(getClass().getResource("Fundo5.png"));

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
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 477, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSair = new JButton("Salvar e Sair");
		btnSair.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnSair.setBounds(10, 286, 98, 23);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Menu.salvarSair();
					frame.setVisible(false);
				} catch (IOException e1) {
					System.out.print("a");
					e1.printStackTrace();
				}
			}
		});
		frame.getContentPane().add(btnSair);
		
		JLabel lblNewLabel = new JLabel("Deseja entrar como?");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(45, 146, 144, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BEM-VINDO A CENTRAL DO BANCO JURA");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_1.setBounds(35, 89, 392, 46);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("GERENTE");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(155, 198, 153, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaInicialG.main(null);
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCliente = new JButton("CLIENTE");
		btnCliente.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaInicial.main(null);
			}
		});
		btnCliente.setBounds(155, 248, 153, 23);
		frame.getContentPane().add(btnCliente);

		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(0, 0, 461, 320);
		frame.getContentPane().add(lblNewLabel_4);
		lblNewLabel_4.setIcon(fundo);
	}
}
