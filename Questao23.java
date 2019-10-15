package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;


public class Questao23 {
    public static void main(String[] args) {
             int a1,a2,a3;
        a1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ângulo do triângulo: "));
        a2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe mais um ângulo: "));
        a3 = 180 - (a1 + a2);
        JOptionPane.showMessageDialog(null, "O valor do terceiro ângulo é "+a3);
    }
    
}
