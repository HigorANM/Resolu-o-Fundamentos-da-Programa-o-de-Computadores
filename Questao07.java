/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questões.pkgdo.livro.fundamentos.da.programação.de.computador.cap;

import javax.swing.JOptionPane;

public class Questao07 {

    public static void main(String[] args) {
        double sal, result, aument;
        double porc = 30;
        //entrada
        sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário: "));
        //processamento
        aument = ((sal * porc) / 100) + sal;
        // saida
        if (sal <= 500) {
            JOptionPane.showMessageDialog(null, "Reajuste de R$" + aument);
        } else {
            JOptionPane.showMessageDialog(null, "Lamentamos em informe que você não tem direito ao aumento de salário.");
        }

    }
}
