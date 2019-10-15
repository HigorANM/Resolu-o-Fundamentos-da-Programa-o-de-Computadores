package questões.pkgdo.livro.fundamentos.da.programação.de.computador.cap;

import javax.swing.JOptionPane;

public class Questao17 {

    public static void main(String[] args) {
        int s, su;
        s = 4531;
        su = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a senha: "));
        if (s == su) {
            JOptionPane.showMessageDialog(null, "Acessa permitido");
        } else {
            JOptionPane.showMessageDialog(null, "Acessa Negado");

        }
    }
}
