package quest_3;

import javax.swing.JOptionPane;

public class Questao3 {
	
	 public static void main(String args[]) {

	double MF;

	double n1 = Double.valueOf (JOptionPane.showInputDialog ("insira a primeira nota:"));
	double n2 = Double.valueOf (JOptionPane.showInputDialog ("insira a segunda nota:"));
	double n3 = Double.valueOf (JOptionPane.showInputDialog ("insira a terceira nota:"));


	MF= (n1+n2+n3)/3;

	if (MF >= 6) {
		
	JOptionPane.showMessageDialog(null, "Aluno(a) aprovado(a)!");
	} 
	
	if ((MF >=4) && (MF < 6)) {
	JOptionPane.showMessageDialog(null, "Aluno(a) em recuperação!");
	}
	
	if (MF<4) {
	JOptionPane.showMessageDialog(null, "Aluno(a) reprovado(a)!");
	}

	}
}
