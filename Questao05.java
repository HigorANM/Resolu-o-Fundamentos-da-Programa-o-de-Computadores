package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;

public class Questao05 {
    public static void main(String[] args) {
          //Variaveis
        double prec, valor;
        
        prec = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o preço do produto: "));
        
        valor = prec*10/100;
        valor = prec-valor;
        
        JOptionPane.showMessageDialog(null, "O valor com desconto é:  R$"+valor+"0");
    }
    
}
