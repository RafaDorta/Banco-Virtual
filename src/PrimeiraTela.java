import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class PrimeiraTela {
	
	private int flag;

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	private JFrame frame;
	ImageIcon logo = new ImageIcon(getClass().getResource("Jura.png"));


	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeiraTela window = new PrimeiraTela();
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
	public PrimeiraTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 477, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Deseja entrar como?");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(45, 146, 144, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BEM-VINDO A CENTRAL DO BANCO JURA");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_1.setBounds(35, 89, 392, 46);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("GERENTE");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(155, 198, 153, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu m = new Menu();
				frame.setVisible(false);
				m.programa(0);
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCliente = new JButton("CLIENTE");
		btnCliente.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Menu m = new Menu();
				frame.setVisible(false);
				m.programa(1);
				
				
			}
		});
		
		btnCliente.setBounds(155, 248, 153, 23);
		frame.getContentPane().add(btnCliente);
		
		JLabel lblNewLabel_2 = new JLabel("New label");

    lblNewLabel_2.setBounds(191, 11, 80, 80);
    frame.getContentPane().add(lblNewLabel_2);
    lblNewLabel_2.setIcon(logo);
	}
	
}
