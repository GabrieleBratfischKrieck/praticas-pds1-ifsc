package quest_6;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Questao6 extends JFrame {

	private JPanel contentPane;
	private JTextField txtnome;
	private JTextField txtn1;
	private JTextField textn2;
	private JTextField txtn3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao6 frame = new Questao6();
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
	public Questao6() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtnome = new JTextField();
		txtnome.setBounds(45, 11, 86, 20);
		contentPane.add(txtnome);
		txtnome.setColumns(10);
		
		txtn1 = new JTextField();
		txtn1.setBounds(21, 63, 86, 20);
		contentPane.add(txtn1);
		txtn1.setColumns(10);
		
		textn2 = new JTextField();
		textn2.setText("");
		textn2.setBounds(21, 108, 86, 20);
		contentPane.add(textn2);
		textn2.setColumns(10);
		
		txtn3 = new JTextField();
		txtn3.setText("");
		txtn3.setBounds(21, 168, 86, 20);
		contentPane.add(txtn3);
		txtn3.setColumns(10);
		
		JLabel lblnome = new JLabel("");
		lblnome.setBounds(61, 38, 46, 14);
		contentPane.add(lblnome);
		
		JLabel lblnota1 = new JLabel("Nota 1");
		lblnota1.setBounds(21, 39, 72, 14);
		contentPane.add(lblnota1);
		
		JLabel lblnota2 = new JLabel("Nota 2 ");
		lblnota2.setBounds(21, 94, 46, 14);
		contentPane.add(lblnota2);
		
		JLabel lblnota3 = new JLabel("Nota 3");
		lblnota3.setBounds(21, 144, 46, 14);
		contentPane.add(lblnota3);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(148, 203, 89, 23);
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		btnCalcular.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String nome = txtnome.getText();
				String n1 = txtn1.getText();
				String n2 = textn2.getText();
				String n3 = txtn3.getText();
				
				Double Nota1 = Double.valueOf(n1);
				Double Nota2 = Double.valueOf(n2);
				Double Nota3 = Double.valueOf(n3);
				
				Double media =(Nota1+Nota2+Nota3)/3;
				
				JOptionPane.showMessageDialog(null,nome + "\n" + media);

			}
			
		});
	}
}
