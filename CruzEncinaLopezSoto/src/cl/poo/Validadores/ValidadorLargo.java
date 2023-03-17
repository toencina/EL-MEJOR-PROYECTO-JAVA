/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.poo.Validadores;

/**
 *
 * @author fcoja
 */
public class ValidadorLargo {
    public static void validarLargoTexto(String texto,
            int tamanoInicial, int tamanoFinal,
            String nombreCampo) throws Exception{
    
        
        if(texto.length() < tamanoInicial ||
                texto.length() > tamanoFinal){
        
            String mensajeError = "EL TAMAÑO DE " +
                    nombreCampo + " DEBE SER MAYOR QUE "  +
                    tamanoInicial + " Y MENOR QUE " +
                    tamanoFinal;
            
            throw new Exception(mensajeError);
        }        
    }
    
    public void validarLargoVacio(String text, 
            String nombreDelCampo) throws Exception{
    
        
        if(text == null || "".equals(text)){
            
            String mensajeError = "DEBE INGRESAR " +
                    "INFORMACIÓN EN EL CAMPO " + 
                    nombreDelCampo;
            
            throw new Exception(mensajeError);
        }
        
    }
}
    

