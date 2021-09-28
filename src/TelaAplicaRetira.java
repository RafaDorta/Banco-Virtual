import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaAplicaRetira {

	private JFrame frame;
	private JTextField textConta;
	private JTextField textValor;
	private int tipo;

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAplicaRetira window = new TelaAplicaRetira();
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
	public TelaAplicaRetira() {
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
		
		JLabel lblNewLabel = new JLabel("CONTA :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(113, 94, 79, 24);
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
		lblValor.setBounds(113, 147, 79, 24);
		frame.getContentPane().add(lblValor);
		
		JButton btnEfetuar = new JButton("EFETUAR");
		btnEfetuar.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnEfetuar .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					TelaCliente c = new TelaCliente();
					frame.setVisible(false);
					System.out.printf("\n\n\n%d\n\n\n",getTipo());
					c.main(null);
				
				
			}
		});
		btnEfetuar.setBounds(180, 213, 105, 23);
		frame.getContentPane().add(btnEfetuar);
		
		JButton btnVoltar = new JButton("<-- VOLTAR");
		btnVoltar .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					TelaCliente c = new TelaCliente();
					frame.setVisible(false);
					c.main(null);
				
				
			}
		});
		btnVoltar.setFont(new Font("Century", Font.PLAIN, 7));
		btnVoltar.setBounds(10, 11, 79, 24);
		frame.getContentPane().add(btnVoltar);
	}

}
