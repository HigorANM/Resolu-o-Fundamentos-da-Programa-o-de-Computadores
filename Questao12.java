package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;

public class Questao12 {
    public static void main(String[] args) {
        double s, sm, qsm;
        s = Double.parseDouble(JOptionPane.showInputDialog(("Informe o valor do sálario: ")));
        sm = Double.parseDouble(JOptionPane.showInputDialog(("Informe o valor do sálario mínimo: ")));
        qsm = s/sm;
        JOptionPane.showMessageDialog(null, "A quatidade de sálarios mínimos é de: "+qsm);
               
    }
    
}
