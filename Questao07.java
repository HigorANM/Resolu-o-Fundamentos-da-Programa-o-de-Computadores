package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;

public class Questao07 {
    public static void main(String[] args) {
                double p, pg, pm;
        
        
        p= Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do Peso: "));
        
        pg = p+(p*15/100);
        pm = p-(p*20/100);
        JOptionPane.showMessageDialog(null, "O Peso com 15% a mais é: ");
        JOptionPane.showMessageDialog(null, "O Peso com 20% a menos é: ");
    }
    
}
