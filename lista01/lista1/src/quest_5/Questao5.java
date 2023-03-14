package quest_5;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Questao5 extends JFrame {

	private JPanel contentPane;
	private JTextField txtTriangulo1;
	private JTextField textTriangulo2;
	private JTextField textTriangulo3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao5 frame = new Questao5();
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
	public Questao5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(268, 165, 89, 23);
		contentPane.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
			if(tri1.equals(tri2)&& (tri2.equals(tri3))){
				JOptionPane.showMessageDialog(null,"Triângulo Equilátero");
			}
			else {
				if (tri1.equals(tri2)|| (tri1 == tri3)|| (tri3 == tri2)){
					JOptionPane.showMessageDialog(null,"Triângulo Isóceles");
			}
			 
				else {
					JOptionPane.showMessageDialog(null,"Triângulo Escaleno");
						
				}
			
			}
        
		String triangulo1 = txtTriangulo1.getText();
		String triangulo2 = txtTriangulo1.getText();
		String triangulo3 = txtTriangulo1.getText(); 
		
		Double tri1 = Double.valueOf(triangulo1);
		Double tri2 = Double.valueOf(triangulo2);
		Double tri3 = Double.valueOf(triangulo3); 
		
		
		
		txtTriangulo1 = new JTextField();
		txtTriangulo1.setBounds(42, 40, 86, 20);
		contentPane.add(txtTriangulo1);
		txtTriangulo1.setColumns(10);
		
		textTriangulo2 = new JTextField();
		textTriangulo2.setBounds(154, 40, 86, 20);
		contentPane.add(textTriangulo2);
		textTriangulo2.setColumns(10);
		
		textTriangulo3 = new JTextField();
		textTriangulo3.setBounds(268, 40, 86, 20);
		contentPane.add(textTriangulo3);
		textTriangulo3.setColumns(10);
		
		JLabel lbltriangulo1 = new JLabel("New label");
		lbltriangulo1.setBounds(59, 15, 46, 14);
		contentPane.add(lbltriangulo1);
		
		JLabel lbltriangulo2 = new JLabel("New label");
		lbltriangulo2.setBounds(177, 15, 46, 14);
		contentPane.add(lbltriangulo2);
		
		JLabel lbltriangulo3 = new JLabel("New label");
		lbltriangulo3.setBounds(288, 15, 46, 14);
		contentPane.add(lbltriangulo3);
	
	}
}


