import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import javax.swing.JScrollPane;

public class TelaVerificaInfos {

	private JFrame frame;
	ImageIcon fundo = new ImageIcon(getClass().getResource("Fundo3.png"));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, int conta) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVerificaInfos window = new TelaVerificaInfos(conta);
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
	public TelaVerificaInfos(int conta) {
		initialize(conta);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int conta) {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnVoltar = new JButton("<-- VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaGerente.main(null);
			}
		});
		btnVoltar.setFont(new Font("Century", Font.PLAIN, 8));
		btnVoltar.setBounds(10, 11, 79, 24);
		frame.getContentPane().add(btnVoltar);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textArea.setText(Menu.verificaInfosConta(conta));
		textArea.setBackground(new Color(69, 69, 69));
		textArea.setForeground(new Color(214, 170, 35));
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("Informa\u00E7\u00F5es da Conta");
		lblNewLabel.setForeground(new Color(214, 170, 35));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(150, 31, 180, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setToolTipText("");
		scrollPane.setBounds(70, 66, 302, 153);
		frame.getContentPane().add(scrollPane);
		
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setForeground(new Color(204, 153, 0));
		lblNewLabel_4.setBounds(0, 0, 461, 320);
		frame.getContentPane().add(lblNewLabel_4);
		lblNewLabel_4.setIcon(fundo);
		
	}
}
