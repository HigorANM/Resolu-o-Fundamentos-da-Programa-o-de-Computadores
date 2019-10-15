package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;

public class Questao22 {
    public static void main(String[] args) {
                double nl,d;
        nl = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o número de lados do poligono: "));
        d = nl * (nl - 3 ) / 2;
        JOptionPane.showMessageDialog(null, "Esse poligono tem "+d+" diagonais");
    }
    
}
