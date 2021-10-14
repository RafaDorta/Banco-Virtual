import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaAplicaRetira {

	private JFrame frame;
	private JTextField textConta;
	private JTextField textValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, int tipo2) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAplicaRetira window = new TelaAplicaRetira(tipo2);
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
	public TelaAplicaRetira(int tipo) {
		initialize(tipo);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize(int tipo) {
		frame = new JFrame();
		frame.setBounds(100, 100, 477, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONTA :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(113, 94, 130, 24);
		frame.getContentPane().add(lblNewLabel);
		
		textConta = new JTextField();
		textConta.setBounds(191, 98, 130, 20);
		frame.getContentPane().add(textConta);
		textConta.setColumns(10);
		
		textValor = new JTextField();
		textValor.setColumns(10);
		textValor.setBounds(191, 151, 130, 20);
		frame.getContentPane().add(textValor);
		
		JLabel lblValor = new JLabel("VALOR :");
		lblValor.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblValor.setBounds(113, 147, 130, 24);
		frame.getContentPane().add(lblValor);
		
		JButton btnEfetuar = new JButton("EFETUAR");
		btnEfetuar.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnEfetuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tipo == 0)
				{
					Menu.acoesCliente(2, null, Integer.parseInt(textConta.getText()), Double.parseDouble(textValor.getText()));
					frame.setVisible(false);
					TelaCliente.main(null);
				}else if(tipo==1) {
					JOptionPane.showMessageDialog(null, "Dinheiro Retirado da Conta!");
					frame.setVisible(false);
					TelaCliente.main(null);
				}else if(tipo==2) {
					JOptionPane.showMessageDialog(null, "Dinheiro Aplicado na Conta!");
					frame.setVisible(false);
					TelaGerente.main(null);
				}else {
					JOptionPane.showMessageDialog(null, "Dinheiro Retirado da Conta!");
					frame.setVisible(false);
					TelaGerente.main(null);
				}
			}
		});
		btnEfetuar.setBounds(180, 213, 130, 23);
		frame.getContentPane().add(btnEfetuar);
		
		JButton btnVoltar = new JButton("<-- VOLTAR");
		btnVoltar .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tipo == 0) {
					frame.setVisible(false);
					TelaCliente.main(null);
				}else if(tipo==1) {
					frame.setVisible(false);
					TelaCliente.main(null);
				}else if(tipo==2) {
					frame.setVisible(false);
					TelaGerente.main(null);
				}else {
					frame.setVisible(false);
					TelaGerente.main(null);
				}
			}
		});
		btnVoltar.setFont(new Font("Century", Font.PLAIN, 7));
		btnVoltar.setBounds(10, 11, 79, 24);
		frame.getContentPane().add(btnVoltar);
	}
}
