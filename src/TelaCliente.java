import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TelaCliente {

	private JFrame frame;
	ImageIcon fundo = new ImageIcon(getClass().getResource("Fundo4.png"));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCliente window = new TelaCliente();
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
	public TelaCliente() {
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
		
		JButton btnAplicar = new JButton("Aplicar na Conta");
		btnAplicar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaAplicaRetira.main(null,0);
			}
		});
		btnAplicar.setBounds(132, 108, 203, 23);
		frame.getContentPane().add(btnAplicar);
		
		JButton btnRetirar = new JButton("Retirar da Conta");
		btnRetirar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnRetirar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaAplicaRetira.main(null, 1);
			}
		});
		btnRetirar.setBounds(132, 141, 203, 23);
		frame.getContentPane().add(btnRetirar);
		
		JButton btnVoltar = new JButton("<-- SAIR");
		btnVoltar .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				PrimeiraTela.main(null);	
			}
		});
		btnVoltar.setFont(new Font("Century", Font.PLAIN, 8));
		btnVoltar.setBounds(10, 11, 79, 24);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnVerificarE = new JButton("Verificar o Extrato");
		btnVerificarE.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnVerificarE.setBounds(132, 208, 203, 23);
		btnVerificarE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaVerificaConta.main(null,0);
			}
		});
		frame.getContentPane().add(btnVerificarE);
		
		JButton btnVerificarS = new JButton("Verificar o Saldo");
		btnVerificarS.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnVerificarS.setBounds(132, 175, 203, 23);
		btnVerificarS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaVerificaConta.main(null,1);
			}
		});
		frame.getContentPane().add(btnVerificarS);
		
		JButton btnAlterarSenha = new JButton("Alterar Senha");
		btnAlterarSenha.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAlterarSenha.setBounds(132, 260, 203, 23);
		btnAlterarSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaAlterarSenha.main(null,0);
			}
		});
		frame.getContentPane().add(btnAlterarSenha);
		
		JLabel lblNewLabel_1 = new JLabel("O que deseja fazer?");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(61, 46, 149, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnAbrirUmaConta = new JButton("Abrir uma Conta");
		btnAbrirUmaConta.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAbrirUmaConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaCriarConta.main(null);
			}
		});
		btnAbrirUmaConta.setBounds(132, 74, 203, 23);
		frame.getContentPane().add(btnAbrirUmaConta);
		
		JLabel lblNewLabel = new JLabel("Bem-Vindo, " + Menu.retornaNome(1));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(163, 14, 172, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setForeground(new Color(204, 153, 0));
		lblNewLabel_4.setBounds(0, 0, 461, 320);
		frame.getContentPane().add(lblNewLabel_4);
		lblNewLabel_4.setIcon(fundo);
	}
}
