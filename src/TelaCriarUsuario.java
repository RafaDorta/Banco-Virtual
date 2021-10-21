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
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class TelaCriarUsuario {

	private JFrame frame;
	private JTextField textNome;
	private JTextField textLogin;
	private JTextField textSenha;
	public int i = 0;
	public int flag=-1;
	ImageIcon fundo = new ImageIcon(getClass().getResource("Fundo3.png"));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCriarUsuario window = new TelaCriarUsuario();
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
	public TelaCriarUsuario() {
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
		
		JButton btnVoltar = new JButton("<-- VOLTAR");
		btnVoltar .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaGerente.main(null);
			}
		});
		btnVoltar.setFont(new Font("Century", Font.PLAIN, 8));
		btnVoltar.setBounds(10, 11, 79, 24);
		frame.getContentPane().add(btnVoltar);
		
		JLabel lblNewLabel = new JLabel("Nome :");
		lblNewLabel.setForeground(new Color(214, 170, 35));
		lblNewLabel.setBounds(121, 115, 57, 14);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUsuario = new JLabel("Login :");
		lblUsuario.setForeground(new Color(214, 170, 35));
		lblUsuario.setBounds(121, 151, 57, 14);
		lblUsuario.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.getContentPane().add(lblUsuario);
		
		JLabel lblNewLabel_1 = new JLabel("Senha :");
		lblNewLabel_1.setForeground(new Color(214, 170, 35));
		lblNewLabel_1.setBounds(121, 192, 57, 14);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_1);
		
		textNome = new JTextField();
		textNome.setBounds(176, 113, 123, 20);
		frame.getContentPane().add(textNome);
		textNome.setColumns(10);
		
		textLogin = new JTextField();
		textLogin.setBounds(176, 149, 123, 20);
		frame.getContentPane().add(textLogin);
		textLogin.setColumns(10);
		
		textSenha = new JTextField();
		textSenha.setBounds(176, 190, 123, 20);
		frame.getContentPane().add(textSenha);
		textSenha.setColumns(10);
		
		JButton btnNewButton = new JButton("Criar");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(198, 249, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag == -1) {
					JOptionPane.showMessageDialog(null, "Selecione um tipo!","BANCO JURA",JOptionPane.WARNING_MESSAGE);
				}else {
					if(Menu.criaUsuario(textLogin.getText(),textSenha.getText(),textNome.getText(),flag)) {
						if(flag == 1) {
							JOptionPane.showMessageDialog(null, "Cliente criado com Sucesso!!\n  Bem-Vindo ao Banco JURA!");	
						}else {
							JOptionPane.showMessageDialog(null, "Gerente criado com Sucesso!!\n  Bem-Vindo ao Banco JURA!");
						}	
						frame.setVisible(false);
						TelaGerente.main(null);
					} else {
						JOptionPane.showMessageDialog(null, "Login ja esta sendo utilizado!","BANCO JURA",JOptionPane.WARNING_MESSAGE);
					}
				}	
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JRadioButton rdbtnGerente = new JRadioButton("Gerente");
		rdbtnGerente.setFont(new Font("Times New Roman", Font.BOLD, 15));
		JRadioButton rdbtnCliente = new JRadioButton("Cliente");
		rdbtnCliente.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rdbtnCliente.setForeground(new Color(214, 170, 35));
		rdbtnCliente.setBackground(new Color(69, 69, 69));
		rdbtnGerente.setForeground(new Color(214, 170, 35));
		rdbtnGerente.setBackground(new Color(69, 69, 69));
		rdbtnGerente.setBounds(135, 66, 81, 23);
		rdbtnGerente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				if(i%2 == 1) {
					rdbtnCliente.setEnabled(false);
					flag =0;
				}else {
					rdbtnCliente.setEnabled(true);
					flag =-1;
				}
				
			}
		});
		frame.getContentPane().add(rdbtnGerente);
		
		rdbtnCliente.setBounds(237, 66, 79, 23);
		rdbtnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				if(i%2 == 1) {
					rdbtnGerente.setEnabled(false);
					flag =1;
				}else { 
					rdbtnGerente.setEnabled(true);
					flag =-1;
				}
			}
		});
		frame.getContentPane().add(rdbtnCliente);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setForeground(new Color(204, 153, 0));
		lblNewLabel_4.setBounds(0, 0, 461, 320);
		frame.getContentPane().add(lblNewLabel_4);
		lblNewLabel_4.setIcon(fundo);
	}
}
