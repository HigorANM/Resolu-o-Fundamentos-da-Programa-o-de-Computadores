package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;

public class Questao17 {
    public static void main(String[] args) {
        double r, c, a, v;
        
        r = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do raio? "));
        c = 2*(Math.PI*r);
        a = (Math.PI * (r*r));
        v = 3/4 * Math.PI*(r*r*r);
        JOptionPane.showMessageDialog(null, "O valor do comprimento do circulo é: "+c);
        JOptionPane.showMessageDialog(null, "O valor da area do circulo é: "+a);
        JOptionPane.showMessageDialog(null, "O valor do volume do circulo é: "+v);

    }
        
}
