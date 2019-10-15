/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questões.pkgdo.livro.fundamentos.da.programação.de.computador.cap;

import javax.swing.JOptionPane;

public class Questao16 {

    public static void main(String[] args) {
        double preco, fim, desc;
        String des, codig;
        preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço"));
        codig = JOptionPane.showInputDialog("Informe o código do produto");
        if (preco <= 30) {
            fim = preco;
            des = "0%";
        } else if (preco <= 100) {
            desc = preco * 0.1;
            fim = preco - desc;
            des = "10%";
        } else {
            desc = preco * 0.15;
            fim = preco - desc;
            des = "15%";
        }
        JOptionPane.showMessageDialog(null, "Código do produto:" + codig);
        JOptionPane.showMessageDialog(null, "O valor do desconto:" + des);
        JOptionPane.showMessageDialog(null, "Novo preço: R$" + fim);
    }
}
