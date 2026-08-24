package ficha6;

import javax.swing.JOptionPane;
import java.util.Calendar;

public class ex27 {

    public static void main(String[] args) {
        int codigo, anoNascimento, anoIngresso;
        int idade, tempoTrabalho;
        int anoAtual;

        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do empregado: "));
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
        anoIngresso = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de ingresso na empresa: "));

        anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        idade = anoAtual - anoNascimento;
        tempoTrabalho = anoAtual - anoIngresso;

        String mensagem;

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            mensagem = "Requerer Reforma";
        } else {
            mensagem = "Não Requerer Reforma";
        }

        JOptionPane.showMessageDialog(null,
            "Código: " + codigo +
            "\nIdade: " + idade + " anos" +
            "\nTempo de trabalho: " + tempoTrabalho + " anos" +
            "\n" + mensagem);
    }
}