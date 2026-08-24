package ficha8;

import javax.swing.JOptionPane;

public class ex12 {

    public static void main(String[] args) {

        int idade, maiorIdade, menorIdade;
        int homens, mulheres;
        int idadeMenorSalario;
        int totalPessoas;

        double salario, somaSalarios, menorSalario=0;

        char sexo;
        char sexoMenorSalario;

        boolean primeiraPessoa;

        String continuar;

        somaSalarios = 0;
        homens = 0;
        mulheres = 0;
        totalPessoas = 0;

        maiorIdade = 0;
        menorIdade = 999;

        idadeMenorSalario = 0;
        sexoMenorSalario = ' ';

        primeiraPessoa = true;

        do {

            idade = Integer.parseInt(JOptionPane.showInputDialog("Introduza a idade:"));

            sexo = JOptionPane.showInputDialog("Introduza o sexo (M/F):")
                    .toUpperCase().charAt(0);

            salario = Double.parseDouble(JOptionPane.showInputDialog("Introduza o salário:"));

            somaSalarios = somaSalarios + salario;
            totalPessoas++;

            // Maior e menor idade
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (idade < menorIdade) {
                menorIdade = idade;
            }

            // Contagem de homens e mulheres
            if (sexo == 'M') {
                homens++;
            } else {
                mulheres++;
            }

            // Menor salário
            if (primeiraPessoa || salario < menorSalario) {
                menorSalario = salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
                primeiraPessoa = false;
            }

            continuar = JOptionPane.showInputDialog("Deseja inserir outra pessoa? (S/N):");

        } while (continuar.equalsIgnoreCase("S"));


        JOptionPane.showMessageDialog(null,
                "Média dos salários: " + (somaSalarios / totalPessoas) +
                "\nMaior idade: " + maiorIdade +
                "\nMenor idade: " + menorIdade +
                "\nQuantidade de homens: " + homens +
                "\nQuantidade de mulheres: " + mulheres +
                "\nPessoa com menor salário:" +
                "\nIdade: " + idadeMenorSalario +
                "\nSexo: " + sexoMenorSalario);

    }

}