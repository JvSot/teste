
package teste;

import javax.swing.JOptionPane;


public class Teste2 {

    
    public static void main(String[] args) {
    
        String nome =JOptionPane.showInputDialog("Digite seu nome");
        
        String n1 = JOptionPane.showInputDialog("Numero 1");
        String n2 = JOptionPane.showInputDialog("Numero 2");
        int r = Integer.parseInt(n1) + Integer.parseInt(n2);
        
        JOptionPane.showMessageDialog(null, "Olá " + nome + " boa noite!"+ "o Resultado é:" + r  , "Título", JOptionPane.ERROR_MESSAGE);
    
    }
    
}
