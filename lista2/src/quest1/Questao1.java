package quest1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Questao1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtcadastrarnumero;
	private JTextField txtmostraresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao1 frame = new Questao1();
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
	public Questao1() {
		
		 ArrayList <Double> listanumero = new ArrayList <>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtmostraresultado = new JTextField();
		txtmostraresultado.setBounds(160, 66, 86, 20);
		contentPane.add(txtmostraresultado);
		txtmostraresultado.setColumns(10);
		
		txtcadastrarnumero = new JTextField();
		txtcadastrarnumero.setBounds(160, 41, 86, 20);
		contentPane.add(txtcadastrarnumero);
		txtcadastrarnumero.setColumns(10);
		
		JLabel lblcadastrarnumero = new JLabel("Informe um número");
		lblcadastrarnumero.setBounds(26, 44, 124, 14);
		contentPane.add(lblcadastrarnumero);
		
		JLabel lblmostraresultado = new JLabel("Resultado:");
		lblmostraresultado.setBounds(26, 69, 86, 14);
		contentPane.add(lblmostraresultado);
		
		JButton btncadastrar = new JButton("cadastrar");
		
		
		btncadastrar.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				
				Double numero = Double.valueOf(txtcadastrarnumero.getText());
				
				listanumero.add(numero);
				
		}
		});
		
		btncadastrar.setBounds(78, 126, 123, 23);
		contentPane.add(btncadastrar);
		
		JButton btnexibir = new JButton("exibir");
		btnexibir.addActionListener (new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Integer quantidade = 0;
				
				for(int i =0; i<listanumero.size();i++);
				if(listanumero.get(i%2 == 0)) {
					quantidade ++;
					
				}
				
				txtmostraresultado.setText(String.valueOf(quantidade));
			}
		});
		
		btnexibir.setBounds(211, 126, 107, 23);
		contentPane.add(btnexibir);
		
	}
}
