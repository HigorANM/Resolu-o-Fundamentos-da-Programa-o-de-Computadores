package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Questao20 {
    public static void main(String[] args) {
                double a,d,e;
        DecimalFormat df = new DecimalFormat("#,##");
        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o angulo formado "
                + "pela escada: "));
        d = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a distancia da escada "
                + "para a parede: "));
        e = d * Math.cos(Math.toRadians(a));
        JOptionPane.showMessageDialog(null, "O comprimento da escada é de "+df.format(e)+"m");
    }
}
