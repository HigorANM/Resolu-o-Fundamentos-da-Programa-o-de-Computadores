package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;

public class Questao14 {
    public static void main(String[] args) {
        int a, at, i, m, s, d;
        
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Em qual ano você nasceu? "));
        at = Integer.parseInt(JOptionPane.showInputDialog(null, "Em qual ano estamos? "));
        i = at-a;
        m = i*12;
        s = m*4;
        d = s*7;
        JOptionPane.showMessageDialog(null, "A sua idade em anos é: "+i);
        JOptionPane.showMessageDialog(null, "A sua idade em meses é: "+m);
        JOptionPane.showMessageDialog(null, "A sua idade em semanas é: "+s);
        JOptionPane.showMessageDialog(null, "A sua idade em dias é: "+d);
               
        
    }
    
}
