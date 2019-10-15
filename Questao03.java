package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;

public class Questao03 {
    public static void main(String[] args) {
  
        //Variaveis
        double num1, num2, div;
        
        //Entrada de Dados
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º número: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º número: "));
        
        //Entrada de Dados
        div=num1/num2;
        
        //Saída de Dados
        JOptionPane.showMessageDialog(null, "A divisõa entre os números é: "+div);
        
    }
    
}
