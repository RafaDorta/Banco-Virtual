import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class TelaVerificarContas {

	private JFrame frame;
	ImageIcon fundo = new ImageIcon(getClass().getResource("Fundo3.png"));
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVerificarContas window = new TelaVerificarContas();
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
	public TelaVerificarContas() {
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
		
		JLabel lblNewLabel = new JLabel("N\u00B0 da Conta");
		lblNewLabel.setForeground(new Color(214, 170, 35));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(250, 52, 88, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(214, 170, 35));
		lblNome.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNome.setBounds(114, 52, 88, 14);
		frame.getContentPane().add(lblNome);
		
		JTextArea txtrRafaelJulia = new JTextArea();
		txtrRafaelJulia.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtrRafaelJulia.setText(Menu.verificaClienteContas());
		txtrRafaelJulia.setBounds(114, 77, 214, 198);
		frame.getContentPane().add(txtrRafaelJulia);
		
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setForeground(new Color(204, 153, 0));
		lblNewLabel_4.setBounds(0, 0, 461, 320);
		frame.getContentPane().add(lblNewLabel_4);
		lblNewLabel_4.setIcon(fundo);
	}
}
