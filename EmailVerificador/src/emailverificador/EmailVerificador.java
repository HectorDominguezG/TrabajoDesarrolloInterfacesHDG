/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emailverificador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JPanel;

/**
 *
 * @author hdomgar0208
 */
public class EmailVerificador extends JPanel {
    
    private String email;
    
    public void Lector(){
        
    }

    public boolean Verificador(String email) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Az-z0-9]+)*(\\.[A-Za-z](2,))$");
        Matcher matcher = pattern.matcher(email);
        return matcher.find();

    }
}
