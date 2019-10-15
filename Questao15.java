/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questões.pkgdo.livro.fundamentos.da.programação.de.computador.cap;

import javax.swing.JOptionPane;

public class Questao15 {

    public static void main(String[] args) {
        double sal = 0, fim;
        int tipo;
        tipo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de conta \n 1 = poupança \n 2=fundos de renda fixa"));
        switch (tipo) {
            case 1:
                sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: "));
                fim = sal + (sal * 0.03);
                JOptionPane.showMessageDialog(null, "No fim de 1 mês, resultará: R$" + fim);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Informe o valor");
                fim = sal + (sal * 0.03);
                JOptionPane.showMessageDialog(null, "No fim de 1 mês, resultará: R$" + fim);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Informe um valor válido");
                break;
        }

    }
}
