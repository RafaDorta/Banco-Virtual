import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaAlterarSenha {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args,int tipo) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAlterarSenha window = new TelaAlterarSenha(tipo);
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
	public TelaAlterarSenha(int tipo2) {
		initialize(tipo2);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int tipo) {
		frame = new JFrame();
		frame.setBounds(100, 100, 477, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnVoltar = new JButton("<-- VOLTAR");
		btnVoltar .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
							if(tipo == 0)
							{
								TelaCliente c = new TelaCliente();
								frame.setVisible(false);
								c.main(null);
							}else {
								TelaGerente c = new TelaGerente();
								frame.setVisible(false);
								c.main(null);
							}
							
						
						
					}
				});
				
				
		
		btnVoltar.setFont(new Font("Century", Font.PLAIN, 8));
		btnVoltar.setBounds(10, 11, 79, 24);
		frame.getContentPane().add(btnVoltar);
		
		JLabel lblNewLabel_2_1 = new JLabel("*-*-*  SENHA ATUAL  *-*-*  ");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(133, 81, 201, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(142, 106, 182, 20);
		frame.getContentPane().add(textField);
		
		JLabel lblNewLabel_2 = new JLabel("*-*-*  NOVA SENHA  *-*-*  ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(137, 137, 192, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(142, 162, 182, 20);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("ALTERAR");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if(tipo == 0)
					{
						JOptionPane.showMessageDialog(null, "Senha Alterada com Sucesso!");
						TelaCliente c = new TelaCliente();
						frame.setVisible(false);
						c.main(null);
					}else {
						JOptionPane.showMessageDialog(null, "Senha Alterada com Sucesso!");
						TelaGerente c = new TelaGerente();
						frame.setVisible(false);
						c.main(null);
					}
					
				
				
			}
		});
		
		btnNewButton.setBounds(174, 235, 115, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
