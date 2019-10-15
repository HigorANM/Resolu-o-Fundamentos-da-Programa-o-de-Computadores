package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;


public class Questao19 {
    public static void main(String[] args) {
                double c,l,a,p;
        c = Double.parseDouble(JOptionPane.showInputDialog(null, "Comprimento do comodo (em metros): "));
        l = Double.parseDouble(JOptionPane.showInputDialog(null,"Largura do comodo (em metros):"));
        a = c * l;
        p = a * 18;
        JOptionPane.showMessageDialog(null, "A area vale "+a+" e é necessário a potência de "+p+
                "W para iluminar por completo por comodo.");
    }
    
}
