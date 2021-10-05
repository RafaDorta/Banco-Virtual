import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class TelaGerente {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGerente window = new TelaGerente();
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
	public TelaGerente() {
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
		
		JButton btnVoltar = new JButton("<-- SAIR");
		btnVoltar .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					PrimeiraTela c = new PrimeiraTela();
					frame.setVisible(false);
					c.main(null);
				
				
			}
		});
		btnVoltar.setFont(new Font("Century", Font.PLAIN, 8));
		btnVoltar.setBounds(10, 11, 79, 24);
		frame.getContentPane().add(btnVoltar);
		
		JLabel lblNewLabel = new JLabel("Bem Vindo @user");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(163, 11, 165, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnVerificarClientes = new JButton("Verificar Clientes");
		btnVerificarClientes.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnVerificarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				TelaVerificarContas c = new TelaVerificarContas();
					frame.setVisible(false);
					
					c.main(null);
			}
		});
		btnVerificarClientes.setBounds(132, 74, 203, 23);
		frame.getContentPane().add(btnVerificarClientes);
		
		JButton btnVerificarConta = new JButton("Verificar Conta");
		btnVerificarConta.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnVerificarConta .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					
					
				
				
			}
		});
		btnVerificarConta.setBounds(132, 108, 203, 23);
		frame.getContentPane().add(btnVerificarConta);
		
		JButton btnAplicarDinheiro = new JButton("Aplicar Dinheiro");
		btnAplicarDinheiro.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAplicarDinheiro.setBounds(132, 142, 203, 23);
		btnAplicarDinheiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				TelaAplicaRetira c = new TelaAplicaRetira(2);
				frame.setVisible(false);
				c.main(null,2);
				
				
			}
		});
		frame.getContentPane().add(btnAplicarDinheiro);
		
		JButton btnFazerTransferencia = new JButton("Fazer Transferencia");
		btnFazerTransferencia.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnFazerTransferencia.setBounds(132, 176, 203, 23);
		btnFazerTransferencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					TelaTransferencia c = new TelaTransferencia();
					frame.setVisible(false);
					
					c.main(null);
				
				
			}
		});
		frame.getContentPane().add(btnFazerTransferencia);
		
		JButton btnFazerRetirada = new JButton("Fazer Retirada");
		btnFazerRetirada.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnFazerRetirada.setBounds(132, 210, 203, 23);
		btnFazerRetirada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					TelaAplicaRetira c = new TelaAplicaRetira(3);
					frame.setVisible(false);
					c.main(null,3);
				
				
			}
		});
		frame.getContentPane().add(btnFazerRetirada);
		
		JButton btnAlterarSenha = new JButton("Alterar Senha");
		btnAlterarSenha.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAlterarSenha.setBounds(132, 262, 203, 23);
		btnAlterarSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				TelaAlterarSenha c = new TelaAlterarSenha(1);
					frame.setVisible(false);
					
					c.main(null,1);
			}
		});
		frame.getContentPane().add(btnAlterarSenha);
		
	}

}
