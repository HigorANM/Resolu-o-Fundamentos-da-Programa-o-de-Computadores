package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;

public class Questao16 {
    public static void main(String[] args) {
        double h, c1, c2;
        
       c1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o primeiro cateto? "));
       c2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o segundo cateto? "));
       h=(Math.sqrt((c1*c1)+(c2*c2)));
       JOptionPane.showMessageDialog(null, "A hipotenusa do triângulo retangulo é: "+h);
        
    }
    
}
