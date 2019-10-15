/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questões.pkgdo.livro.fundamentos.da.programação.de.computador.cap;

import javax.swing.JOptionPane;

public class Questao25
{
    public static void main(final String[] args) {
        final double hrex = Double.parseDouble(JOptionPane.showInputDialog("informe o numero"));
        final double hrfalt = Double.parseDouble(JOptionPane.showInputDialog("informe o numero"));
        final double resul = hrex - 2.0 * hrfalt / 3.0;
        final double min = resul * 60.0;
        if (min >= 2400.0) {
            JOptionPane.showMessageDialog(null, "bonus de 500 reais");
        }
        else if (min >= 1800.0) {
            JOptionPane.showMessageDialog(null, "bonus de 400 reais");
        }
        else if (min >= 1200.0) {
            JOptionPane.showMessageDialog(null, "bonus de 300 reais");
        }
        else if (min >= 600.0) {
            JOptionPane.showMessageDialog(null, "bonus de 200 reais");
        }
        else {
            JOptionPane.showMessageDialog(null, "bonus de 100 reais");
        }
    }
}
