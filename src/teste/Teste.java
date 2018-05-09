
package teste;

import java.awt.*;
import javax.swing.*;

public class Teste {
    /* Definir a janela  */
    public static void main(String[] args) {
        JFrame janela = new JFrame("Janela 1");
        janela.setVisible(true);
        janela.setBounds(50, 100, 400, 350);
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        /* Adicionar um conteiner*/
        Container caixa = janela.getContentPane();
        //FlowLayout flow = new FlowLayout();
        caixa.setLayout(new GridLayout(4,1));
        //comentario
        //comentario 2
        
        JPanel parte1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel parte2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel parte3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel parte4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        
        /* Adicionar os recursos da interface */
        JTextField texto1 = new JTextField(20);
        JButton botao1 = new JButton ("ok");
        JButton botao2 = new JButton ("cancelar");
        JRadioButton selecao1 = new JRadioButton("A");
        JRadioButton selecao2 = new JRadioButton("B");
        JRadioButton selecao3 = new JRadioButton("C");
        
        JComboBox combobox = new JComboBox();
        combobox.addItem("Texto 1");
        combobox.addItem("Texto 2");
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(selecao1);
        grupo.add(selecao2);
        grupo.add(selecao3);
        
        
        
        parte1.add(texto1);
        parte1.add(botao1);
        parte1.add(botao2);
        
        parte2.add(selecao1);
        parte2.add(selecao2);
        parte2.add(selecao3);
       
        parte3.add(combobox);
        
        parte4.add(botao1);
        parte4.add(botao2);
        
        // ADICIONAR PAINEL NO CONTEINER
        caixa.add(parte1);
        caixa.add(parte2);
        caixa.add(parte3);
        caixa.add(parte4);
        
        janela.pack();
        
        
    }
    
}
