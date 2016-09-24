/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ACorrea
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date relogio = new Date();
        System.out.println("A hora eh:");
        System.out.println(relogio.toString());
        
        // Create an object that it contains the Screen size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.print("Resolucion ");
        
        double ancho = screenSize.getWidth();
        double alto = screenSize.getHeight();
        System.out.print(ancho);
        System.out.print("x");
        System.out.println(alto);
        
        Locale local = Locale.getDefault();   
        //String cadena = local.getLanguage();
        
        // Take the languages of the system
        String cadena = local.getDisplayLanguage();
        System.out.print("O sistema esta em ");
        System.out.println(cadena);
        
        
        
    }
    
}
