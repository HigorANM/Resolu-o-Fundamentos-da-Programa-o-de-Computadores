package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;

public class Questao02 {
    public static void main(String[] args) {
  
        //Variaveis
        int num1, num2, num3, mult;
        
        //Entrada de Dados
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º número: "));
        
        //Processamento de dados
        mult=num1*num2*num3;
        
        //Saída de Dados
        JOptionPane.showMessageDialog(null, "A multiplicação entre os três números é: "+mult);
        
    }
    
}
