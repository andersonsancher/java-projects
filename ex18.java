package ficha6;

import javax.swing.JOptionPane;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id_aluno;
		double nota1, nota2, nota3;
		double me; // recebe a média dos exercícios
		double ma; // calcula a média de aproveitamento
		char nf;
		
		id_aluno = Integer.parseInt(JOptionPane.showInputDialog("Digite id do aluno:  "));
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual valor da nota1: "));
		
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual valor da nota2: "));
		
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual valor da nota3: "));
		
		me = Double.parseDouble(JOptionPane.showInputDialog("Qual valor da média dos exercícios: "));
		
		ma = (nota1 + nota2 * 2 + nota3 * 3 + me) / 7;
		
		
		
		if (ma >=90) {System.out.println("Parabéns, você foi aprovado! ");
		nf = 'A';}
		
		else if (ma >=75) {System.out.println("Parabéns, você foi aprovado! ");
		nf = 'B';}
		
		else if (ma >= 60) {System.out.println("Parabéns, você foi aprovado! ");
		nf = 'C';}
		
		else if (ma >=40) {System.out.println("Reprovado! ");
		nf = 'D';}
		
		else {System.out.println( "Reprovado");
		nf= 'E';}
		
		System.out.println("ID do aluno: " + id_aluno);
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Nota 3: " + nota3);
		System.out.println("Média dos exercícios: " + me);
		System.out.println("Média de aproveitamento: " + ma);
		System.out.println("Nota final: " + nf);
		
		
		
		
		
		
	}

}
