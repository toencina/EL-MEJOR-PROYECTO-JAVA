/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.poo.Validadores;

import java.sql.Array;
import java.util.ArrayList;

/**
 *
 * @author fcoja
 */
public class ValidadorDv {
    public static boolean validarDV (String dv) {

        boolean validacionDv = false;
        try {

//            String dvstr = String.valueOf(dv);
//
            dv = dv.toUpperCase();
            
            ArrayList<String> digitos = new ArrayList();
            digitos.add("0");
            digitos.add("1");
            digitos.add("2");
            digitos.add("3");
            digitos.add("4");
            digitos.add("5");
            digitos.add("6");
            digitos.add("7");
            digitos.add("8");
            digitos.add("9");
            digitos.add("K");
            

            if (digitos.contains(dv)){
                validacionDv = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacionDv;
    }
    
}
