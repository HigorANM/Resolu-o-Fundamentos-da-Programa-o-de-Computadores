/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questões.pkgdo.livro.fundamentos.da.programação.de.computador.cap;

import javax.swing.JOptionPane;

public class Questao12 {

    public static void main(String[] args) {
        double sal, salF;
        sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário"));
        if (sal <= 350) {
            sal = sal + 100;
            salF = sal - (sal * 0.07);
        } else {
            if (sal <= 600) {
                sal = sal + 75;
                salF = sal - (sal * 0.07);
            } else if (sal <= 900) {
                sal = sal + 50;
                salF = sal - (sal * 0.07);
            } else {
                sal = sal + 35;
                salF = sal - (sal * 0.07);
            }
        }
        JOptionPane.showMessageDialog(null, "O novo salário é: R$" + salF);
    }
}
