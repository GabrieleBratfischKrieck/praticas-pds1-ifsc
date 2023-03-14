package quest_5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Questao5 extends JFrame {

	private JPanel contentPane;
	private JTextField txtTriangulo1;
	private JTextField txtTriangulo2;
	private JTextField txtTriangulo3;

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

		txtTriangulo1 = new JTextField();
		txtTriangulo1.setBounds(45, 11, 86, 20);
		contentPane.add(txtTriangulo1);
		txtTriangulo1.setColumns(10);

		txtTriangulo2 = new JTextField();
		txtTriangulo2.setBounds(136, 11, 86, 20);
		contentPane.add(txtTriangulo2);
		txtTriangulo2.setColumns(10);

		txtTriangulo3 = new JTextField();
		txtTriangulo3.setBounds(227, 11, 86, 20);
		contentPane.add(txtTriangulo3);
		txtTriangulo3.setColumns(10);

		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setBounds(318, 10, 71, 23);
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String triangulo1 = txtTriangulo1.getText();
				String triangulo2 = txtTriangulo2.getText();
				String triangulo3 = txtTriangulo3.getText();

				Double tri1 = Double.valueOf(triangulo1);
				Double tri2 = Double.valueOf(triangulo2);
				Double tri3 = Double.valueOf(triangulo3);

				if (tri1.equals(tri2) && (tri2.equals(tri3))) {
					JOptionPane.showMessageDialog(null, "Triângulo Equilátero");
				} else if (tri1.equals(tri2) || (tri1.equals(tri3)) || (tri3.equals(tri2))) {
					JOptionPane.showMessageDialog(null, "Triângulo Isóceles");
				} else {
					JOptionPane.showMessageDialog(null, "Triângulo Escaleno");

				}

			}

		});
		contentPane.add(btnVerificar);
	}

}
