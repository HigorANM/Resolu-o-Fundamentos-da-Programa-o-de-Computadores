package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;
import javax.swing.JOptionPane;
public class Questao01 {
    public static void main(String[] args) {

        //Variaveis
        int num1, num2, sub;
        
        //Entrada de Dados
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        
        //Entrada de Dados
        sub= num1-num2;
        
        //Saída de Dados
        JOptionPane.showMessageDialog(null, "A subtração do primeiro pelo segundo é : "+sub);
        
    }
    
}
