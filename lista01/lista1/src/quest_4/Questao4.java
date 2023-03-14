package quest_4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Questao4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao4 window = new Questao4();
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
	public Questao4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(31, 32, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				float valor1 = Float.valueOf (JOptionPane.showInputDialog("Insira o primeiro valor"));
				
				float valor2 = Float.valueOf (JOptionPane.showInputDialog("Insira o segundo valor"));
				
				JOptionPane.showMessageDialog(null, valor1+valor2);
			}
			
			
		});
		
		
		JButton btnNewButton_1 = new JButton("*");
		btnNewButton_1.setBounds(141, 32, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {

				float valor1 = Float.valueOf (JOptionPane.showInputDialog("Insira o primeiro valor"));
				
				float valor2 = Float.valueOf (JOptionPane.showInputDialog("Insira o segundo valor"));
				
				JOptionPane.showMessageDialog(null, valor1*valor2);
			}
		});
			
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(31, 66, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				float valor1 = Float.valueOf (JOptionPane.showInputDialog("Insira o primeiro valor"));
				
				float valor2 = Float.valueOf (JOptionPane.showInputDialog("Insira o segundo valor"));
				
				JOptionPane.showMessageDialog(null, valor1-valor2);
			}
		});
		JButton btnNewButton_3 = new JButton(":");
		btnNewButton_3.setBounds(141, 66, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				float valor1 = Float.valueOf (JOptionPane.showInputDialog("Insira o primeiro valor"));
				
				float valor2 = Float.valueOf (JOptionPane.showInputDialog("Insira o segundo valor"));
				
				JOptionPane.showMessageDialog(null, valor1 /valor2);
			}
		});
		
		
	}
	
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
}
