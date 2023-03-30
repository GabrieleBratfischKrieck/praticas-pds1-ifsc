package quest2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Questao2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCadastrar;
	private JTextField txtmenornumero;
	private JTextField txtmaiornumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao2 frame = new Questao2();
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
	public Questao2() {
		
		ArrayList<Double> numeros = new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtmenornumero = new JTextField();
		txtmenornumero.setEnabled(false);
		txtmenornumero.setEditable(false);
		txtmenornumero.setBounds(119, 105, 86, 20);
		contentPane.add(txtmenornumero);
		txtmenornumero.setColumns(10);
		
		txtCadastrar = new JTextField();
		txtCadastrar.setBounds(95, 39, 86, 20);
		contentPane.add(txtCadastrar);
		txtCadastrar.setColumns(10);
		
		txtmaiornumero = new JTextField();
		txtmaiornumero.setEnabled(false);
		txtmaiornumero.setEditable(false);
		txtmaiornumero.setBounds(119, 70, 86, 20);
		contentPane.add(txtmaiornumero);
		txtmaiornumero.setColumns(10);
		
		JLabel lblcadastrar = new JLabel("Cadastrar:");
		lblcadastrar.setBounds(20, 42, 69, 14);
		contentPane.add(lblcadastrar);
		
		JLabel lblmaiornumero = new JLabel("Maior número:");
		lblmaiornumero.setBounds(20, 73, 86, 14);
		contentPane.add(lblmaiornumero);
		
		JLabel lblmenornumero = new JLabel("Menor número:");
		lblmenornumero.setBounds(20, 108, 86, 14);
		contentPane.add(lblmenornumero);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double num = Double.valueOf(txtCadastrar.getText());
				
				numeros.add(num);
			}
		});
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrar.setBounds(64, 172, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnExibir = new JButton("Exibir");
		
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double menor = Double.MAX_VALUE;
				Double maior = Double.MIN_VALUE;
				
				for (int i = 0; i < numeros.size(); i++) {
					if(numeros.get(i)>maior) {
						maior = numeros.get(i);
					}
					else {
					if(numeros.get(i)<menor) {
						menor = numeros.get(i);
					}
				}
				}
				txtmaiornumero.setText(String.valueOf(maior));
				txtmenornumero.setText(String.valueOf(menor));
			}
		});
		
		btnExibir.setBounds(183, 172, 89, 23);
		contentPane.add(btnExibir);
		}
	}


