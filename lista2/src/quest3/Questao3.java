package quest3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Questao3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtprofessor;
	private JTextField txtaluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao3 frame = new Questao3();
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
	public Questao3() {
		ArrayList<String> professores = new ArrayList<>();
		ArrayList<String> alunos = new ArrayList<>(); 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblprofessor = new JLabel("Professor");
		lblprofessor.setBounds(53, 11, 61, 14);
		contentPane.add(lblprofessor);
		
		JLabel lblaluno = new JLabel("Aluno");
		lblaluno.setBounds(53, 36, 61, 14);
		contentPane.add(lblaluno);
		
		txtprofessor = new JTextField();
		txtprofessor.setBounds(114, 8, 86, 20);
		contentPane.add(txtprofessor);
		txtprofessor.setColumns(10);
		
		txtaluno = new JTextField();
		txtaluno.setBounds(114, 36, 86, 20);
		contentPane.add(txtaluno);
		txtaluno.setColumns(10);
		
		JButton btncadastraraluno = new JButton("Cadastrar Aluno");
		
		btncadastraraluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p1 = txtaluno.getText();
				alunos.add(p1);
			}
		});
		
		btncadastraraluno.setBounds(53, 103, 171, 23);
		contentPane.add(btncadastraraluno);
		
		JButton btnexibiraluno = new JButton("Exibir Aluno");
		
		btnexibiraluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, alunos);
			}
		});
		
		btnexibiraluno.setBounds(243, 103, 138, 23);
		contentPane.add(btnexibiraluno);
		
		JButton btncadastrarprofessor = new JButton("Cadastrar Professor");
		btncadastrarprofessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p1 = txtprofessor.getText();
				professores.add(p1);
			}
		});
		btncadastrarprofessor.setBounds(33, 137, 181, 23);
		contentPane.add(btncadastrarprofessor);
		
		JButton btnexibirprofessor = new JButton("Exibir Professor ");
		
		btnexibirprofessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, professores);
			}
		});
		
		btnexibirprofessor.setBounds(218, 137, 181, 23);
		contentPane.add(btnexibirprofessor);
	}
}
