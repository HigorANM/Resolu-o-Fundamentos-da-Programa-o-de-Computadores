package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;
import javax.swing.JOptionPane;
public class Questao13 {
    public static void main(String[] args) {
        
    
        //Variaveis
        int num, i, result, c;
        
        //Entrada
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a tabuada que você quer? "));
        
        //Processamento
        for (i=1; i<11; i++) {
        result=num*i;
        
        //Saída de Dados
        JOptionPane.showMessageDialog(null, num+"x"+i+"= "+result+" ");
        
        }
        
    }
    
}
           
          
            
    
    
    
