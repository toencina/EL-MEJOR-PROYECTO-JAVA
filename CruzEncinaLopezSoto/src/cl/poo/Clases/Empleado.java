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
public class Empleado {
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int telefono;
    private String rut;
    private String dv;
    private TipoEmpleado tipoempleado;


    public Empleado(String nombres, String apellidoPaterno, String apellidoMaterno, int telefono, String rut, String Dv, TipoEmpleado tipoempleado) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.rut = rut;
        this.dv = dv; 
        this.tipoempleado = tipoempleado;
                
    }
    
    public Empleado() {
        this.nombres = "";
        this.apellidoPaterno = "";
        this.apellidoMaterno = "";
        this.telefono = 0;
        this.rut = "";
        this.dv = "";
        this.tipoempleado = new TipoEmpleado();
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
        
    }
    
    public TipoEmpleado getTipoEmpleado(){
        return tipoempleado;
    }
    public void setTipoEmpleado(TipoEmpleado tipoempleado){
        this.tipoempleado = tipoempleado;
    }
    
    
    public void imprimir(){

        String imp = "Registrar Colaborador\n\n" +
                     "RUN: " + this.rut + " - "+this.dv + "\n"+
                     "NOMBRES: " + this.nombres + "\n" +
                     "APELLIDO PATERNO: " + this.apellidoPaterno + "\n"+
                     "APELLIDO MATERNO: " + this.apellidoMaterno + "\n"+
                     "TIPO EMPLEADO: " + this.tipoempleado.getCodigo() + "\n"+
                     "CODIGO EMPLEADO: " + this.tipoempleado.getNombreTipoEmpleado() + "\n" +
                     "TELEFONO: "+this.telefono + "\n";
        
        System.out.println(imp);
    
    
    }
    
}
