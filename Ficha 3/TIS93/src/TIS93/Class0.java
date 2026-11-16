package TIS93;

import javax.swing.JOptionPane;

public class Class0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//comentario
		
		/*
		 * 
		 */
		
		// declação de variaveis
		int n1;
		int n2, n3;
		
		int n4=123;
		
		double d1=2.5;
		
		boolean fim = false;
		
		char c1='A';
		
		String nome="Maria";
		String s;
		
		//atribuição de valores
		
		n1=100;
		n2=66;
		n3=-20;
		n4=10;
		
		//escrever valores
		System.out.println("Hola Mundo");
		
		System.out.println(n1);
		
		System.out.println("n1 =" + n1);
		System.out.println("n1 =" + n1);
		System.out.println("n1 =" + n1 + " n2= " + n2 + " n3= " +n3);
		System.out.println("n1 =" + n1 + "\nn2= " + n2 + "\nn3= " + n3);  // sequencia de escape -> "\n"
		
		//converter tipos
		//string ->int
		s="10";
		n1=Integer.parseInt(s);
		
		//string->double
		s="2.5";
		d1=Double.parseDouble(s);
		
		//num->string
		s=String.valueOf(n1);
		
		//cast
		n2=5;
		n3=2;
		
		d1=(double)n2/(double)100;
		System.out.println("aaaaaaaaaaaaa d1=" +d1);
		
		//operadores arimeticos
		// + - * /
		// % -> resto da divisão
		// ++ 
		// --
		// += n1+=10 n1=n1+10
		
		n1=n2+n3;
		System.out.println("n1=" + n1);
		
		n1=n2%n3;
		System.out.println("n1=" + n1);
		
		n1++;
		System.out.println("n1" + n1);
		
		n1--;
		System.out.println("n1" + n1);
		
		n1+=10;
		System.out.println("n1" + n1);
		
		//ler valores
		
		//string
		
		nome = JOptionPane.showInputDialog("Escreva seu nome: ");
		System.out.println(" o Seu nome é: " + nome);
		
		//int
		n1=Integer.parseInt(JOptionPane.showInputDialog("Escreva um numero inteiro: "));
		
		//double
		d1=Double.parseDouble(JOptionPane.showInputDialog("Escreva tua altura: "));
		
		//estruturas de controlo
				//condicionais -> if, switch case
				//repetição -> do...while, for
				
				
				//operadores relacionais
				//operadores logicos
				
				
				//operadores relacionais
				//  ==  !=   > >=   <   <=
				
				
				//operadores lógicos
				//  AND  &&       OR    ||      NOT   !
				
				
				
				//if
				
				int n=5;
				
				if(n==5) {
					System.out.println("ok");
				}
				
				if(n==4) {
					n++;
				}
				else {
					n--;
				}
				
				
				n=5;
				if(n<=3) {
					n+=1;
				}
				else if (n<=4) {
					n+=2;
				}
				else {
					n+=3;
				}
				
		
		
	}

}
