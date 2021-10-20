import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaVerificaConta {

	private JFrame frame;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args, int tipo) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVerificaConta window = new TelaVerificaConta(tipo);
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
	public TelaVerificaConta(int tipo2) {
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
		
		JLabel lblNewLabel = new JLabel("CONTA :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(111, 133, 79, 24);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(181, 136, 130, 20);
		frame.getContentPane().add(textField);
		
		JButton btnEfetuar = new JButton("VERIFICAR");
		btnEfetuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tipo==0) {
					String v = Menu.verificaExtratoCliente(Integer.parseInt(textField.getText()));
					if(v!="inexistente") {
						frame.setVisible(false);
						TelaExtrato.main(null,Integer.parseInt(textField.getText()));
					} else {
						JOptionPane.showMessageDialog(null, "Numero da Conta errado!","BANCO JURA",JOptionPane.WARNING_MESSAGE);
					}
				}else if(tipo==1) {
					if(Menu.acoesCliente(4,null, Integer.parseInt(textField.getText()), 0)) {
						frame.setVisible(false);
						TelaCliente.main(null);
					}
				} else if(tipo==2){
					if(Menu.verificaConta(Integer.parseInt(textField.getText()))) {
						frame.setVisible(false);
						TelaVerificaInfos.main(null,Integer.parseInt(textField.getText()));
					} else {
						JOptionPane.showMessageDialog(null, "Numero da Conta errado!","BANCO JURA",JOptionPane.WARNING_MESSAGE);
					}
				}else if(tipo == 3) {
					if(Menu.verificaConta(Integer.parseInt(textField.getText()))) {
						frame.setVisible(false);
						TelaAlterarDados.main(null,Integer.parseInt(textField.getText()));
					}else {
						JOptionPane.showMessageDialog(null, "Numero da Conta errado!","BANCO JURA",JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});
		btnEfetuar.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnEfetuar.setBounds(181, 178, 105, 23);
		frame.getContentPane().add(btnEfetuar);
		
		JButton btnVoltar = new JButton("<-- VOLTAR");
		btnVoltar.setFont(new Font("Century", Font.PLAIN, 7));
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tipo >= 2) {
				frame.setVisible(false);
				TelaGerente.main(null);}else {frame.setVisible(false);
				TelaCliente.main(null);}
			}
		});
		btnVoltar.setBounds(10, 11, 79, 24);
		frame.getContentPane().add(btnVoltar);
	}
}
