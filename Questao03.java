package questões.pkgdo.livro.fundamentos.da.programação.de.computador.cap;

import javax.swing.JOptionPane;

public class Questao03 {

    public static void main(final String[] args) {
        double d1, d2;
        d1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1º número: "));
        d2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2º número: "));
        if (d1 < d2) {
            JOptionPane.showMessageDialog(null, "o menor número é: " + d1);
        } else {
            if (d1 == d2) {
                JOptionPane.showMessageDialog(null, "Os números são iguais");
            } else {
                JOptionPane.showMessageDialog(null, "o menor número é: " + d2);
            }
        }
    }
}
