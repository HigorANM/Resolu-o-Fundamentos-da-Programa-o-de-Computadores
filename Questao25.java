package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;


public class Questao25 {
    public static void main(String[] args) {
            int h,m,hm,tm,ms;
        h = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a hora: "));
        m = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe os minutos: "));
        hm = h * 60;
        tm = hm + m;
        ms = tm * 60;
        JOptionPane.showMessageDialog(null, h+" horas convertida para minutos vale "+hm+" "
                + "minutos");
        JOptionPane.showMessageDialog(null, "O total de minutos é "+tm+" minutos");
        JOptionPane.showMessageDialog(null, "O total dos minutos convertidos em segundos vale "
                +ms+" segundos");
    }
    
}
