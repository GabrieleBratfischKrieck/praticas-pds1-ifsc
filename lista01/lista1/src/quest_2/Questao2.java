package quest_2;

	import java.util.ArrayList;

	import javax.swing.JOptionPane;

	public class Questao2 {

		public static void main(String[] args) {

			ArrayList <String> ListadeFrutas = new ArrayList <String> ();

			for (int i = 0; i < 10; i++) {

				String frutas = JOptionPane.showInputDialog("Digite uma fruta :");

				ListadeFrutas.add(frutas);

			}

			JOptionPane.showMessageDialog(null,ListadeFrutas);

		}

	}