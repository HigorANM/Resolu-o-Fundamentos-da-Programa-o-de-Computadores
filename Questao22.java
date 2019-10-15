package questões.pkgdo.livro.fundamentos.da.programação.de.computador.cap;

import javax.swing.JOptionPane;

public class Questao22 {

    public static void main(String[] args) {
        int i, p, g = 0;
        i = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade? "));
        p = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu peso? "));
        if (i < 20) {
            if (p <= 60) {
                g = 9;
            } else {
                if (p > 60 && p <= 90) {
                    g = 8;
                } else {
                    g = 7;
                }
            }
        } else {
            if (i >= 20 && i <= 50) {
                if (p <= 60) {
                    g = 6;
                } else {
                    if (p > 60 && p <= 90) {
                        g = 5;
                    } else {
                        g = 4;
                    }
                }
            }
        }
        if (i > 50) {
            if (p <= 60) {
                g = 3;
            } else {
                if (p > 60 && p <= 90) {
                    g = 2;
                } else {
                    g = 1;
                }

            }
        }
        JOptionPane.showMessageDialog(null, "você pertence ao grupo de risco: "+g);
                
    }
}
