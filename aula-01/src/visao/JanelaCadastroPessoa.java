package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtnome;
	private JTextField txtcpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastroPessoa frame = new JanelaCadastroPessoa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaCadastroPessoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnome = new JLabel("Nome:");
		lblnome.setBackground(new Color(255, 128, 192));
		lblnome.setBounds(96, 77, 39, 20);
		contentPane.add(lblnome);
		
		txtnome = new JTextField();
		txtnome.setBackground(new Color(255, 128, 192));
		txtnome.setBounds(139, 77, 86, 20);
		contentPane.add(txtnome);
		txtnome.setColumns(10);
		
		txtcpf = new JTextField();
		txtcpf.setBackground(new Color(255, 128, 192));
		txtcpf.setBounds(139, 46, 86, 20);
		contentPane.add(txtcpf);
		txtcpf.setColumns(10);
		
		Label lblcpf = new Label("CPF:");
		lblcpf.setBackground(new Color(255, 0, 128));
		lblcpf.setBounds(107, 46, 26, 20);
		contentPane.add(lblcpf);
		
		JButton btnsalvar = new JButton("salvar");
		btnsalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtnome.getText();
				String cpf = txtcpf.getText();
			
				if (nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum nome preenchido!");
				}
				if (cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum cpf preenchido!");
				}
				
				Funcionario func = new Funcionario();
				func.setNome(nome);
				func.setCpf(Long.volueOf(cpf));
				
				FuncionarioDAO bdPessoa = FuncionarioDAO.get;
				bdPessoa.inserir(func);
			
			}
		});
		btnsalvar.setBackground(new Color(255, 128, 128));
		btnsalvar.setBounds(138, 166, 89, 23);
		contentPane.add(btnsalvar);
	}
}
