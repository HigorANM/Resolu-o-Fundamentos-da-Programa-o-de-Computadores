package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;

public class Questao15 {
    public static void main(String[] args) {
        double s, c1, c2, sr;
        
        s = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o sálario de João? "));
        c1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da 1ª conta de João? "));
        c2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da 2ª conta de João? "));
        c1= c1+(c1*2/100);
        c2= c2+(c2*2/100);
        sr= s-(c1+c2);
        JOptionPane.showMessageDialog(null, "O restante do sálario de joão é de: "+sr);
    }
    
}
