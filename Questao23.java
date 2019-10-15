package questões.pkgdo.livro.fundamentos.da.programação.de.computador.cap;

import javax.swing.JOptionPane;

public class Questao23 {

    public static void main(String[] args) {
        int c, q;
        double vd = 0, pf, pu = 0, pt;
        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o código do Produto? "));
        q = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a quantidade comprada do produto? "));

        if (c <= 10) {
            pu = 10;
        } else {
            if (c > 11 && c <= 20) {
                pu = 15;
            } else {
                if (c > 20 && c <= 30) {
                    pu = 20;
                } else {
                    if (c > 30 && c <= 40) {
                        pu = 30;
                    }
                }
            }
        }
        pt = pu * q;
        if (pt > 500) {
            vd = 0.15;
        } else {
            if (pt > 250) {
                vd = 0.10;
            } else {
                if (pt <= 250) {
                    vd = 0.05;

                }
            }
        }
        pf = pt + (pt*vd);
        JOptionPane.showMessageDialog(null, "O valor unitario é: " + pu);
        JOptionPane.showMessageDialog(null, "O valor total é: " + pt);
        JOptionPane.showMessageDialog(null, "O valor do desconto é: "+vd);
        JOptionPane.showMessageDialog(null, "O valor final é: " + pf);

    }

}
