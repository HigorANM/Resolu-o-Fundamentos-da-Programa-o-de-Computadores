package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;

public class Questao11 {
    public static void main(String[] args) {
        int dma, dme, a;
        dma = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da base maior?"));
        dme = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da base menor?"));
        a = (dma*dme)/2;
        JOptionPane.showMessageDialog(null, "O valor da area do Losango é: "+a);
    }
    
}
