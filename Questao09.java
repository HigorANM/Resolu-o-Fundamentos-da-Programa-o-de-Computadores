package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;

public class Questao09 {
    public static void main(String[] args) {
        int bma, bme, area, altura;
        bma = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor da base maior? "));
        bme = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor da base menor? "));
        altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor da altura? "));
        area=((bma+bme)*altura)/2;
        JOptionPane.showMessageDialog(null, "A area do trapézio é:"+area);
        
    }
    
}
