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
public class ValidadorTelefono {
    public static void validarInt(int numero,
            String nombreCampo) throws Exception {

        String largo = String.valueOf(numero);

        if (largo.length() != 9) {
            String mensajeError = "DEBE INGRESAR "
                    + nombreCampo + " DE 9 DIGITOS";

            throw new Exception(mensajeError);
        }
    }
    
}
