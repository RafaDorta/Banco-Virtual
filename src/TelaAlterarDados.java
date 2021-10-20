import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TelaAlterarDados {

	private JFrame frame;

	/**
	 * Launch the application.
	 * @param conta 
	 */
	public static void main(String[] args, int conta) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAlterarDados window = new TelaAlterarDados(conta);
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
	public TelaAlterarDados(int conta) {
		initialize(conta);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int conta) {
		frame = new JFrame();
		frame.setBounds(100, 100, 477, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnVoltar = new JButton("<-- VOLTAR");
		btnVoltar.setBounds(10, 11, 79, 24);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					frame.setVisible(false);
					TelaGerente.main(null);		
			}
		});
		frame.getContentPane().setLayout(null);
		btnVoltar.setFont(new Font("Century", Font.PLAIN, 8));
		frame.getContentPane().add(btnVoltar);
		
		JButton btnAlterarLimite = new JButton("Alterar Limite");
		btnAlterarLimite.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAlterarLimite.setBounds(135, 121, 190, 24);
		btnAlterarLimite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double newLimite = Double.parseDouble(JOptionPane.showInputDialog("Digite o Limite:"));
				
				if(Menu.acoesGerente(4, conta, 0, newLimite, 0)) {
					JOptionPane.showMessageDialog(null, "Limite Alterado com Sucesso!");
					frame.setVisible(false);
					TelaGerente.main(null);
				}			
			}
		});
		frame.getContentPane().add(btnAlterarLimite);
		
		JButton btnAlterarRendimento = new JButton("Alterar Rendimento");
		btnAlterarRendimento.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAlterarRendimento.setBounds(135, 173, 190, 24);
		btnAlterarRendimento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double newRendimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o Rendimento:"));
				
				if(Menu.acoesGerente(4, conta, 0, newRendimento, 1)) {
					JOptionPane.showMessageDialog(null, "Rendimento Alterado com Sucesso!");
					frame.setVisible(false);
					TelaGerente.main(null);
				}						
			}
		});
		frame.getContentPane().add(btnAlterarRendimento);
		
		JLabel lblNewLabel = new JLabel("Alterar Dados:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(60, 84, 118, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
