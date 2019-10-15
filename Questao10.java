package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;

public class Questao10 {
    public static void main(String[] args) {
            int l, area;
        l = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor do lado? "));
        area=l*l;
        JOptionPane.showMessageDialog(null, "A area do quadrado é: "+area);
        
    }
    
}
