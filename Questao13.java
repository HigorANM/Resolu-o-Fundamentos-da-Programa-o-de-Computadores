/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questões.pkgdo.livro.fundamentos.da.programação.de.computador.cap;

import javax.swing.JOptionPane;

public class Questao13 {

    public static void main(String[] args) {
        double preco, custoF;
        custoF = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço"));
        if (custoF <= 50) {
            preco = custoF + (custoF * 0.05);
        } else if (custoF <= 100) {
            preco = custoF + (custoF * 0.1) + (custoF * 0.15);
        } else {
            preco = custoF + (custoF * 0.15) + (custoF * 0.15);
        }

        if (preco <= 80) {
            JOptionPane.showMessageDialog(null, "Preço: R$" + preco + ". Categoria: Barato.");
        } else {
            if (preco <= 120) {
                JOptionPane.showMessageDialog(null, "Preço: R$" + preco + ". Categoria: Normal.");
            } else if (preco <= 200) {
                JOptionPane.showMessageDialog(null, "Preço: R$" + preco + ". Categoria: Caro.");
            } else {
                JOptionPane.showMessageDialog(null, "Preço: R$" + preco + ". Categoria: Muito Caro.");
            }
        }

    }
}
