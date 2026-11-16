package TIS93;

import javax.swing.JOptionPane;

public class ex15 {

    public static void main(String[] args) {

        int hEntManha, mEntManha;
        int hSaiAlmoco, mSaiAlmoco;
        int hEntTarde, mEntTarde;
        int hSaiFim, mSaiFim;

        int inicioManha, fimManha;
        int inicioTarde, fimTarde;
        int totalMinutos, horas, minutos;

        
        hEntManha = Integer.parseInt(JOptionPane.showInputDialog("Entrada manhã (hora):"));
        mEntManha = Integer.parseInt(JOptionPane.showInputDialog("Entrada manhã (minutos):"));

        hSaiAlmoco = Integer.parseInt(JOptionPane.showInputDialog("Saída almoço (hora):"));
        mSaiAlmoco = Integer.parseInt(JOptionPane.showInputDialog("Saída almoço (minutos):"));

        hEntTarde = Integer.parseInt(JOptionPane.showInputDialog("Entrada tarde (hora):"));
        mEntTarde = Integer.parseInt(JOptionPane.showInputDialog("Entrada tarde (minutos):"));

        hSaiFim = Integer.parseInt(JOptionPane.showInputDialog("Saída fim do dia (hora):"));
        mSaiFim = Integer.parseInt(JOptionPane.showInputDialog("Saída fim do dia (minutos):"));

        
        inicioManha = (hEntManha * 60) + mEntManha;
        fimManha = (hSaiAlmoco * 60) + mSaiAlmoco;

        inicioTarde = (hEntTarde * 60) + mEntTarde;
        fimTarde = (hSaiFim * 60) + mSaiFim;

        
        totalMinutos = (fimManha - inicioManha) + (fimTarde - inicioTarde);

        
        horas = totalMinutos / 60;
        minutos = totalMinutos % 60;

        System.out.println("Tempo total trabalhado: " + horas + "h " + minutos + "min");
    }
}