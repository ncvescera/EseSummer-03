package esesummer.pkg03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class GUI extends JFrame{
    JPanel panel = new JPanel();
    JTextField textbox = new JTextField(50);
    String array = "Il cane mangia il gatto come il topo mangia il cane";
    
    public GUI(){
        textbox.getDocument().addDocumentListener(new MyDocumentListener());
        
        panel.add(textbox);
        
        this.add(panel,"Center");
        
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
