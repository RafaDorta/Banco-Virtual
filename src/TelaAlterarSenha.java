import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaAlterarSenha {

	private JFrame frame;
	private JTextField textAtual;
	private JTextField textNova;
	ImageIcon fundo = new ImageIcon(getClass().getResource("Fundo3.png"));
	ImageIcon fundo2 = new ImageIcon(getClass().getResource("Fundo4.png"));

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
				if(tipo == 0) {
					frame.setVisible(false);
					TelaCliente.main(null);
				} else {
					frame.setVisible(false);
					TelaGerente.main(null);
				}		
			}
		});
		btnVoltar.setFont(new Font("Century", Font.PLAIN, 8));
		btnVoltar.setBounds(10, 11, 79, 24);
		frame.getContentPane().add(btnVoltar);
		
		JLabel lblNewLabel_2_1 = new JLabel("*-*-*  SENHA ATUAL  *-*-*  ");
		if(tipo != 0) {
			lblNewLabel_2_1.setForeground(new Color(214, 170, 35));
		}
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(133, 81, 201, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		textAtual = new JTextField();
		textAtual.setColumns(10);
		textAtual.setBounds(142, 106, 182, 20);
		frame.getContentPane().add(textAtual);
		
		JLabel lblNewLabel_2 = new JLabel("*-*-*  NOVA SENHA  *-*-*  ");
		if(tipo != 0) {
			lblNewLabel_2.setForeground(new Color(214, 170, 35));
		}
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(137, 137, 192, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textNova = new JTextField();
		textNova.setColumns(10);
		textNova.setBounds(142, 162, 182, 20);
		frame.getContentPane().add(textNova);
		
		JButton btnNewButton = new JButton("ALTERAR");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tipo == 0) {
					Menu.alteraSenha(textAtual.getText(), textNova.getText(), 1);
					frame.setVisible(false);
					TelaCliente.main(null);
				} else {
					Menu.alteraSenha(textAtual.getText(), textNova.getText(), 0);
					frame.setVisible(false);
					TelaGerente.main(null);
				}
			}
		});
		btnNewButton.setBounds(174, 235, 115, 23);
		frame.getContentPane().add(btnNewButton);
		
		if(tipo != 0) {
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
