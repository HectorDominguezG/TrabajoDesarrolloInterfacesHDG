/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanelimagen;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author hecto
 */
public class imagenFondoPropertyEditorSupport extends PropertyEditorSupport {

    private imagenFondoPanel imagenFondoPanel = new imagenFondoPanel();
    
    @Override
    public boolean supportsCustomEditor() {
        return true; 
    }

    @Override
    public Component getCustomEditor() {
        return imagenFondoPanel; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getJavaInitializationString() {
        imagenFondo imagenFondo = imagenFondoPanel.getSelectedValue();
        String ruta = imagenFondo.getRutaImagen().getAbsolutePath();
        ruta = ruta.replace('\\','/');
        return "new jpanelimagen.imagenFondo("+"new java.io.File(\""+ruta+"\"),"+imagenFondo.getOpacidad()+"f)"; 
    }

    @Override
    public Object getValue() {
        return imagenFondoPanel.getSelectedValue(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
