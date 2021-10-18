import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


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
		frame.setBounds(100, 100, 477, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnVoltar = new JButton("<-- SAIR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				PrimeiraTela.main(null);
			}
		});
		btnVoltar.setFont(new Font("Century", Font.PLAIN, 8));
		btnVoltar.setBounds(10, 11, 79, 24);
		frame.getContentPane().add(btnVoltar);
		
		JLabel lblNewLabel = new JLabel("Bem Vindo, " + Menu.retornaNome(0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(152, 21, 248, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnVerificarClientes = new JButton("Verificar Clientes");
		btnVerificarClientes.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnVerificarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaVerificarContas.main(null);
			}
		});
		btnVerificarClientes.setBounds(132, 46, 203, 23);
		frame.getContentPane().add(btnVerificarClientes);
		
		JButton btnVerificarConta = new JButton("Verificar Conta");
		btnVerificarConta.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnVerificarConta .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaVerificaConta.main(null,2);
			}
		});
		btnVerificarConta.setBounds(132, 80, 203, 23);
		frame.getContentPane().add(btnVerificarConta);
		
		JButton btnAplicarDinheiro = new JButton("Aplicar Dinheiro");
		btnAplicarDinheiro.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAplicarDinheiro.setBounds(132, 114, 203, 23);
		btnAplicarDinheiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaAplicaRetira.main(null,2);
			}
		});
		frame.getContentPane().add(btnAplicarDinheiro);
		
		JButton btnFazerTransferencia = new JButton("Fazer Transferencia");
		btnFazerTransferencia.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnFazerTransferencia.setBounds(132, 148, 203, 23);
		btnFazerTransferencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaTransferencia.main(null);			
			}
		});
		frame.getContentPane().add(btnFazerTransferencia);
		
		JButton btnFazerRetirada = new JButton("Fazer Retirada");
		btnFazerRetirada.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnFazerRetirada.setBounds(132, 182, 203, 23);
		btnFazerRetirada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaAplicaRetira.main(null,3);
			}
		});
		frame.getContentPane().add(btnFazerRetirada);
		
		JButton btnAlterarSenha = new JButton("Alterar Senha");
		btnAlterarSenha.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAlterarSenha.setBounds(132, 286, 203, 23);
		btnAlterarSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaAlterarSenha.main(null,1);
			}
		});
		frame.getContentPane().add(btnAlterarSenha);
		
		JButton btnNewButton = new JButton("Criar Nova Conta");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(132, 216, 203, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaCriarUsuario.main(null);
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAjusta = new JButton("Ajustar Dados");
		btnAjusta.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAjusta.setBounds(132, 252, 203, 23);
		btnAjusta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaVerificaConta.main(null,2);
			}
		});
		frame.getContentPane().add(btnAjusta);
	}
}
