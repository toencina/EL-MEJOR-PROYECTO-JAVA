/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.poo.Clases;

/**
 *
 * @author fcoja
 */
public class TipoEmpleado {
    private String nombreTipoEmpleado;
    private int codigo;

    public TipoEmpleado(String nombreTipoEmpleado, int codigo) {
        this.nombreTipoEmpleado = nombreTipoEmpleado;
        this.codigo = codigo;
    }
       
    public TipoEmpleado() {
        this.nombreTipoEmpleado = "";
        this.codigo = 0;
    }

    public String getNombreTipoEmpleado() {
        return nombreTipoEmpleado;
    }

    public void setNombreTipoEmpleado(String nombreTipoEmpleado) {
        this.nombreTipoEmpleado = nombreTipoEmpleado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
    
    
    
    
}
