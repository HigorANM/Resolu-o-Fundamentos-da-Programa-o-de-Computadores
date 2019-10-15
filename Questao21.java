package questões.pkgdo.livro.fundamentos.da.programação.de.computadores;

import javax.swing.JOptionPane;
public class Questao21 {
    public static void main(String[] args) {
        double sm ,sb , se , s, ve, vt ;
        int ht , he ;
        
        ht = Integer.parseInt(JOptionPane.showInputDialog(null, "Horas de trabalhadas: "));
        sm = Double.parseDouble(JOptionPane.showInputDialog(null, "Salário Mínimo: "));
        he = Integer.parseInt(JOptionPane.showInputDialog(null, "Horas extras trabalhads: "));
        vt = sm / 8 ;
        ve = sm / 4 ;
        sb = ht * vt ;
        se = he * ve ;
        s = sb + se ;
        JOptionPane.showMessageDialog(null, "O sálario a receber será de exatamente: "+s);    
}
}