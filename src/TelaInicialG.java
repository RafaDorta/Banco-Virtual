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
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class TelaInicialG {

	private JFrame frame;
	private JTextField textLogin;
	private JPasswordField passwordField;
	ImageIcon fundo = new ImageIcon(getClass().getResource("Fundo3.png"));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicialG window = new TelaInicialG();
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
	public TelaInicialG() {
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
		lblNewLabel.setForeground(new Color(214, 170, 35));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(128, 124, 76, 31);
		frame.getContentPane().add(lblNewLabel);
						
		JLabel lblSenha = new JLabel("SENHA :");
		lblSenha.setForeground(new Color(214, 170, 35));
		lblSenha.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSenha.setBounds(128, 180, 76, 31);
		frame.getContentPane().add(lblSenha);
				
		JLabel lblNewLabel_1 = new JLabel("BEM-VINDO A CENTRAL DO BANCO JURA");
		lblNewLabel_1.setForeground(new Color(214, 170, 35));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(67, 47, 332, 46);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Menu.checkLogin(textLogin.getText(),new String(passwordField.getPassword()),0)) {
					JOptionPane.showMessageDialog(null, "Bem Vindo!");
					frame.setVisible(false);
					TelaGerente.main(null);
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
				frame.setVisible(false);
				PrimeiraTela.main(null);
			}
		});
		btnVoltar.setFont(new Font("Century", Font.PLAIN, 8));
		btnVoltar.setBounds(10, 11, 88, 24);
		frame.getContentPane().add(btnVoltar);
		
		textLogin = new JTextField();
		textLogin.setColumns(10);
		textLogin.setBounds(190, 130, 138, 20);
		frame.getContentPane().add(textLogin);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.BOLD, 15));
		passwordField.setBounds(190, 186, 138, 20);
		frame.getContentPane().add(passwordField);
		
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setForeground(new Color(204, 153, 0));
		lblNewLabel_4.setBounds(0, 0, 461, 320);
		frame.getContentPane().add(lblNewLabel_4);
		lblNewLabel_4.setIcon(fundo);
	}
}
