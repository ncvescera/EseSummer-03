package esesummer.pkg03;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;

public class MyDocumentListener implements DocumentListener{

    @Override
            public void insertUpdate(DocumentEvent e) {
        try {
            System.out.println(e.getDocument().getText(0, e.getDocument().getLength()));
        } catch (BadLocationException ex) {
            Logger.getLogger(MyDocumentListener.class.getName()).log(Level.SEVERE, null, ex);
        }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
               // System.out.println(textbox.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        

}
