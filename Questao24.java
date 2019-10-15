package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Questao24 {
    public static void main(String[] args) {
                double r,d,ma,le;
        r = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor em reais: "));
        d = r / 1.80;
        ma = r / 2.00;
        le = r / 3.57;
        JOptionPane.showMessageDialog(null, "O valor em Reais digitado convertido para Dolares é "
                +d);
        JOptionPane.showMessageDialog(null, "O valor em Reais digitado convertido para Marco Alemão"
                + " é "+ma);
        JOptionPane.showMessageDialog(null, "O valor em Reais digitado convertido para Libra "
                + "Esterlina é "+le);
    }
    
}
