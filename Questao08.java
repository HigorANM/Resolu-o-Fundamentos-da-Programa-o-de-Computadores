package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;

public class Questao08 {
    public static void main(String[] args) {
           double p, g;
           
         p = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o seu peso(Kg)? "));
         
         g = p*1000;
         
         JOptionPane.showMessageDialog(null, "O seu peso em gramas é: "+g+"g");
         
    }
}
