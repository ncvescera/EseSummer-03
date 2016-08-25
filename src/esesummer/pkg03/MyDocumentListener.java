package esesummer.pkg03;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;

public class MyDocumentListener implements DocumentListener{

    @Override
    public void insertUpdate(DocumentEvent e) {
        try {
            System.out.println(getTextFieldText(e));
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
    
    private String getTextFieldText(DocumentEvent e) throws BadLocationException{
        return e.getDocument().getText(0, e.getDocument().getLength());
    }
    
    private String[] stringToArray(String text){
        ArrayList<String> array = new ArrayList();
        for(int i = 0; i < text.length(); i++){
            array.add(text.substring(0,text.indexOf(' ')));
            text = text.substring(text.indexOf(' ')+1);
        }
        array.add(text);
        
        String[] end = new String[array.size()];
        array.toArray(end);
        
        return end;
    }
        

}
