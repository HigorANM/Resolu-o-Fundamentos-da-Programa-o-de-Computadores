/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questões.pkgdo.livro.fundamentos.da.programação.de.computador.cap;

import javax.swing.JOptionPane;

public class Questao10 {

    public static void main(String[] args) {
        double preco, custoF;
        custoF = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço de fábrica"));

        if (12000 >= custoF) {
            preco = custoF + (custoF * 0.05);
        } else if (custoF <= 25000) {
            preco = custoF + (custoF * 0.1) + (custoF * 0.15);
        } else {
            preco = custoF + (custoF * 0.15) + (custoF * 0.2);
        }
        JOptionPane.showMessageDialog(null, "O preço do carro é:" + preco);
    }
}
