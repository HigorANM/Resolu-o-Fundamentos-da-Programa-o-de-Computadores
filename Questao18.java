package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;
import javax.swing.JOptionPane;

public class Questao18 {
    public static void main(String[] args) {
        double c, f;
        
        c = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da temperatura(Cº)? "));
        f = 180*(c+32)/100;
        JOptionPane.showMessageDialog(null, "O valor da temperatura em Fahrenheit é: "+f);
    }
    
}
