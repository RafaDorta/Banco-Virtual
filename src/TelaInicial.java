import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class TelaInicial {

	private JFrame frame;
	private JTextField textLogin;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
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
	public TelaInicial() {
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
		
		JLabel lblNewLabel = new JLabel("LOGIN :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(128, 124, 76, 31);
		frame.getContentPane().add(lblNewLabel);
		
		textLogin = new JTextField();
		textLogin.setBounds(196, 130, 138, 20);
		frame.getContentPane().add(textLogin);
		textLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("SENHA :");
		lblSenha.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSenha.setBounds(128, 180, 76, 31);
		frame.getContentPane().add(lblSenha);
		
		JLabel lblNewLabel_1 = new JLabel("BEM-VINDO A CENTRAL DO BANCO JURA");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(67, 47, 332, 46);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu m = new Menu();
				if(m.checkLogin(textLogin.getText(),new String(textSenha.getText()))) {
					JOptionPane.showMessageDialog(null, "Bem Vindo!");
					TelaCliente c = new TelaCliente();
					frame.setVisible(false);
					c.main(null);
				}else {
					JOptionPane.showMessageDialog(null, "Dados Invalidos!","BANCO JURA",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnEntrar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnEntrar.setBounds(196, 248, 99, 23);
		frame.getContentPane().add(btnEntrar);
		
		
		
		JButton btnVoltar = new JButton("<-- VOLTAR");
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
	}
}
