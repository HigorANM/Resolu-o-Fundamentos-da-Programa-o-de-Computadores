package questões.pkgdo.livro.fundamentos.da.programação.de.computador.cap;

import javax.swing.JOptionPane;

public class Questao19 {

    public static void main(String[] args){
    String s;
    double pi, a ;
  s = JOptionPane.showInputDialog("Qual o seu gênero: (M ou F)");
  a = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua altura? "));
        if (s=="M") {
            pi = (72.7*a)-58;
            
        }else{
            pi = (62.1*a)-44.7;
        }
        JOptionPane.showMessageDialog(null, "Seu peso ideal é: "+pi);
                
    }

}
