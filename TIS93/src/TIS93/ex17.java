package TIS93;

import javax.swing.JOptionPane;

public class ex17 {

    public static void main(String[] args) {

        
    	double horasTrabalhada;
    	double valorHrTrabalhada;
    	double ss;
    	double irs;
    	double salarioBruto;
    	double salarioLiquido;
    	
    	
    	horasTrabalhada = Double.parseDouble(JOptionPane.showInputDialog("Quantas horas Trabalhou esse mês? "));
    	valorHrTrabalhada = Double.parseDouble(JOptionPane.showInputDialog("Quanto ganha por Hora? "));
    	
    	salarioBruto = horasTrabalhada * valorHrTrabalhada;
    	    	
    	ss = salarioBruto * 0.11;
    	irs = salarioBruto * 0.235;
    	
    	salarioLiquido = salarioBruto - ss -irs;
        
        System.out.println("o Salário Bruto:  " + salarioBruto);
        System.out.println("Desconto para a segurança social é: " + ss );
        System.out.println("Retenção do IRS é: " + irs );
        System.out.println("Salário Líquido: " + salarioLiquido);
        
    }
}