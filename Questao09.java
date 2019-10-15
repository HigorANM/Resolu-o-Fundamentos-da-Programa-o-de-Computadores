/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questões.pkgdo.livro.fundamentos.da.programação.de.computador.cap;

import javax.swing.JOptionPane;

public class Questao09 {

    public static void main(String[] args) {
        double saldoM, credito;
        saldoM = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo médio"));
        if (saldoM < 200) {
            credito = saldoM * 0.1;
        } else if (saldoM < 300) {
            credito = saldoM * 0.2;
        } else {
            if (saldoM <= 400) {
                credito = saldoM * 0.25;
            } else {
                credito = saldoM * 0.3;
            }
        }
        JOptionPane.showMessageDialog(null, "seu saldo médio é: " + saldoM + ". O seu créito é: " + credito);

    }

}
