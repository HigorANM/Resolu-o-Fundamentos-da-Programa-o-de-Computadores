package questões.pkgdo.livro.fundamentos.da.programação.de.computador.cap;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Questao06 {

    public static void main(String[] args) {
        String[] options = {"", "1", "2", "3"};
        double n1, n2, poten, raiz1, raiz2, raizcub1, raizcub2, subt;
        int escolha;
        Scanner e = new Scanner(System.in);

        //entrada
        n1 = Double.parseDouble(JOptionPane.showInputDialog("1º Numero"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("2º Numero"));
        JOptionPane.showMessageDialog(null, " Menu : \n 1 : O Primeiro elevado ao segundo. "
                + "\n 2 : Raiz quadrada de cada numero. "
                + "\n 3 : Raiz cubica de cada numero. ");
        escolha = (JOptionPane.showOptionDialog(null, "Qual procedimento você deseja seguir? ",
                "Escolha ",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]));
        //processamento
        poten = Math.pow(n1, n2);
        raiz1 = Math.sqrt(n1);
        raiz2 = Math.sqrt(n2);
        raizcub1 = Math.cbrt(n1);
        raizcub2 = Math.cbrt(n2);
//saida
        switch (escolha) {
            case 1:
                JOptionPane.showMessageDialog(null, "O Primeiro elevado ao segundo: " + poten);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Raiz quadrada de cada numero respectivamente \n " + raiz1 + " e " + raiz2);
                break;
            case 3:
               JOptionPane.showMessageDialog(null, "Raiz Cubica de cada numero respectivamnete \n" + raizcub1 + " e " + raizcub2);
                break;
        }
    }
}
