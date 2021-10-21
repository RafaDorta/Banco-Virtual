import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TelaCriarConta {

	private JFrame frame;
	ImageIcon fundo = new ImageIcon(getClass().getResource("Fundo4.png"));

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
		
		JButton btnNewButton = new JButton("Poupança");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.acoesCliente(1, "Poupança", 0, 0);
				JOptionPane.showMessageDialog(null, "Conta criada com Sucesso!!\n  Numero da Conta: " + Menu.retornaNmrConta());
				frame.setVisible(false);
				TelaCliente.main(null);
			}
		});
		btnNewButton.setBounds(161, 97, 134, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCorrente = new JButton("Corrente");
		btnCorrente.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnCorrente.setBounds(161, 144, 134, 23);
		btnCorrente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.acoesCliente(1, "Corrente", 0, 0);
				JOptionPane.showMessageDialog(null, "Conta criada com Sucesso!!\n  Numero da Conta: " + Menu.retornaNmrConta());
				frame.setVisible(false);
				TelaCliente.main(null);
			}
		});
		frame.getContentPane().add(btnCorrente);
		
		JButton btnEspecial = new JButton("Especial");
		btnEspecial.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnEspecial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.acoesCliente(1, "Especial", 0, 0);
				JOptionPane.showMessageDialog(null, "Conta criada com Sucesso!!\n  Numero da Conta: " + Menu.retornaNmrConta());
				frame.setVisible(false);
				TelaCliente.main(null);
			}
		});
		btnEspecial.setBounds(161, 191, 134, 23);
		frame.getContentPane().add(btnEspecial);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setForeground(new Color(204, 153, 0));
		lblNewLabel_4.setBounds(0, 0, 461, 320);
		frame.getContentPane().add(lblNewLabel_4);
		lblNewLabel_4.setIcon(fundo);
		
	}

}
