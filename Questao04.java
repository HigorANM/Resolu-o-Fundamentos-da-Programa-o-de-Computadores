package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;

public class Questao04 {
    public static void main(String[] args) {
        
        double n1, n2, mp;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1º nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2º nota: "));
        
        mp=((n1*2)+(n2*3))/5;
        
        JOptionPane.showMessageDialog(null, "A média ponderada entre as notas é: "+mp);
        
    }
    
}
