package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;

public class Questao06 {
    public static void main(String[] args) {
            //Variaveis
        double s, sn, v;
        
        
        s = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do salário: "));
        v = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor das vendas: "));
        
        sn = s+(v*4/100);
        
        JOptionPane.showMessageDialog(null, "O novo salário é de:  R$"+sn+"0");
    }
    
}