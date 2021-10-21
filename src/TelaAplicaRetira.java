import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TelaAplicaRetira {

	private JFrame frame;
	private JTextField textConta;
	private JTextField textValor;
	ImageIcon fundo = new ImageIcon(getClass().getResource("Fundo3.png"));
	ImageIcon fundo2 = new ImageIcon(getClass().getResource("Fundo4.png"));

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
		if(tipo >= 2) {
			lblNewLabel.setForeground(new Color(214, 170, 35));
		}
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
		if(tipo >= 2) {
			lblValor.setForeground(new Color(214, 170, 35));
		}
		lblValor.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblValor.setBounds(113, 147, 130, 24);
		frame.getContentPane().add(lblValor);
		
		JButton btnEfetuar = new JButton("EFETUAR");
		btnEfetuar.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnEfetuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tipo == 0) {
					Menu.acoesCliente(2, null, Integer.parseInt(textConta.getText()), Double.parseDouble(textValor.getText()));
					frame.setVisible(false);
					TelaCliente.main(null);
				} else if(tipo==1) {
					Menu.acoesCliente(3, null, Integer.parseInt(textConta.getText()), Double.parseDouble(textValor.getText()));
					frame.setVisible(false);
					TelaCliente.main(null);
				} else if(tipo==2) {
					if(Menu.acoesGerente(1, Integer.parseInt(textConta.getText()), 0, Double.parseDouble(textValor.getText()), 0))
					{JOptionPane.showMessageDialog(null, "Dinheiro Aplicado na Conta!");
					
					frame.setVisible(false);
					TelaGerente.main(null);}
					else {
						JOptionPane.showMessageDialog(null, "Numero da Conta errado!","BANCO JURA",JOptionPane.WARNING_MESSAGE);
					}
				} else {
					if(Menu.acoesGerente(3, Integer.parseInt(textConta.getText()), 0, Double.parseDouble(textValor.getText()), 0)) {
					JOptionPane.showMessageDialog(null, "Dinheiro Retirado da Conta!");
					frame.setVisible(false);
					TelaGerente.main(null);}
					else {
						JOptionPane.showMessageDialog(null, "Ups, algo deu errado !","BANCO JURA",JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});
		btnEfetuar.setBounds(180, 213, 130, 23);
		frame.getContentPane().add(btnEfetuar);
		
		JButton btnVoltar = new JButton("<-- VOLTAR");
		btnVoltar .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tipo >= 2) {
					frame.setVisible(false);
					TelaGerente.main(null);
				}else {
					frame.setVisible(false);
					TelaCliente.main(null);
				}
			}
		});
		btnVoltar.setFont(new Font("Century", Font.PLAIN, 7));
		btnVoltar.setBounds(10, 11, 79, 24);
		frame.getContentPane().add(btnVoltar);
		
		if(tipo >= 2) {
			JLabel lblNewLabel_4 = new JLabel("New label");
			lblNewLabel_4.setForeground(new Color(204, 153, 0));
			lblNewLabel_4.setBounds(0, 0, 461, 320);
			frame.getContentPane().add(lblNewLabel_4);
			lblNewLabel_4.setIcon(fundo);
		}else {
			JLabel lblNewLabel_4 = new JLabel("New label");
			lblNewLabel_4.setForeground(new Color(204, 153, 0));
			lblNewLabel_4.setBounds(0, 0, 461, 320);
			frame.getContentPane().add(lblNewLabel_4);
			lblNewLabel_4.setIcon(fundo2);
		}
	}
}
