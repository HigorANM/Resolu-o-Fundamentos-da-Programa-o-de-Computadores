/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questões.pkgdo.livro.fundamentos.da.programação.de.computador.cap;

import javax.swing.JOptionPane;

public class Questao11 {

    public static void main(String[] args) {
        double sal, salF;
        sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário"));
        if (sal <= 300) {
            salF = sal + (sal * 0.15);
        } else {
            if (sal <= 600) {
                salF = sal + (sal * 0.1);
            } else if (sal <= 900) {
                salF = sal + (sal * 0.05);
            } else {
                salF = sal;
            }
        }
        JOptionPane.showMessageDialog(null, "O novo salário é: R$" + salF);
    }
}
