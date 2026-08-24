package ficha7;

import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		int opcao;
		int maior=0;
		int menor=0;
		double media=0;
		int soma=0;
		String invalida;
		
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
        
        opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "MENU\n1 - Maior\n2 - Menor\n3 - Média\n4 - Soma\n\nEscolha a operação:"));

        switch (opcao) {
            case 1:{
            		maior=num1;
            		if(num2>maior)maior=num2;
            		if(num3>maior)maior=num3;
            		System.out.println("maior=" + maior);
            		break;
            }
            case 2:{ menor = num1;
            		 if(num2< num1)menor=num2;
            		 if(num3 < num2)menor=num3;
            		 System.out.println("menor= " + menor);
            		 break;
            }
            case 3:{ media = ((num1 + num2 + num3) / 3);
            		
            		System.out.println("média= " + media);
            				 
            		 break;
            		 }
             case 4: {
            		 soma = (num1 + num2 + num3);
            		 System.out.println("média= " + soma);
            		 break;
             }
            default: 
            	
            invalida = "Opção inválida";
            
            JOptionPane.showMessageDialog(null, invalida);
            
               
        }
        
        
        
	}

}
