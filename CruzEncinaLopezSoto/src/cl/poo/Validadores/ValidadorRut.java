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
public class ValidadorRut {
    public static boolean validarRut (String rut){
        boolean validacionRut = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");

            int rutint = Integer.parseInt(rut);

            if (String.valueOf(rutint).length() == 7|| String.valueOf(rutint).length() == 8 ){
                validacionRut = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacionRut;
    }
    
}
