import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TelaCliente {

	private JFrame frame;

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
		
		JLabel lblNewLabel = new JLabel("Bem Vindo @user");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(163, 11, 165, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnAplicar = new JButton("Aplicar na Conta");
		btnAplicar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAplicar .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					TelaAplicaRetira c = new TelaAplicaRetira();
					frame.setVisible(false);
					c.setTipo(0);
					c.main(null);
				
				
			}
		});
		btnAplicar.setBounds(132, 80, 203, 23);
		frame.getContentPane().add(btnAplicar);
		
		JButton btnRetirar = new JButton("Retirar da Conta");
		btnRetirar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnRetirar .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					TelaAplicaRetira c = new TelaAplicaRetira();
					frame.setVisible(false);
					c.setTipo(1);
					c.main(null);
				
				
			}
		});
		btnRetirar.setBounds(132, 113, 203, 23);
		frame.getContentPane().add(btnRetirar);
		
		JButton btnVoltar = new JButton("<-- SAIR");
		btnVoltar .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					TelaInicial c = new TelaInicial();
					frame.setVisible(false);
					c.main(null);
				
				
			}
		});
		btnVoltar.setFont(new Font("Century", Font.PLAIN, 8));
		btnVoltar.setBounds(10, 11, 79, 24);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnVerificarE = new JButton("Verificar o Extrato");
		btnVerificarE.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnVerificarE.setBounds(132, 180, 203, 23);
		btnVerificarE .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				TelaVerificaConta c = new TelaVerificaConta();
					frame.setVisible(false);
					c.setTipo(0);
					c.main(null);
				
				
			}
		});
		frame.getContentPane().add(btnVerificarE);
		
		JButton btnVerificarS = new JButton("Verificar o Saldo");
		btnVerificarS.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnVerificarS.setBounds(132, 147, 203, 23);
		btnVerificarS .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				TelaVerificaConta c = new TelaVerificaConta();
					frame.setVisible(false);
					c.setTipo(1);
					c.main(null);
				
				
			}
		});
		frame.getContentPane().add(btnVerificarS);
		
		JButton btnAlterarSenha = new JButton("Alterar Senha");
		btnAlterarSenha.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAlterarSenha.setBounds(132, 250, 203, 23);
		frame.getContentPane().add(btnAlterarSenha);
		
		JLabel lblNewLabel_1 = new JLabel("O que deseja fazer?");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(61, 46, 149, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
