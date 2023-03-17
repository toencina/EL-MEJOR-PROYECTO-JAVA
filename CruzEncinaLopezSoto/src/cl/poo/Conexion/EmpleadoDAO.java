/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.poo.Conexion;

import cl.poo.Clases.Empleado;
import cl.poo.Clases.TipoEmpleado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fcoja
 */
public class EmpleadoDAO {
    public boolean insertar(Empleado empleado){
    
        boolean resultado = false;
        String query = "INSERT INTO EMPLEADO (RUT, DV, NOMBRES, APELLIDOPATERNO,"
                + "APELLIDOMATERNO, TELEFONO, NOMBRETIPOEMPLEADO,CODIGO ) VALUES (?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement  ps = ConexionDAO.getConnection().prepareStatement(query);
            
            int i = 1;
            ps.setString(i++, empleado.getRut());
            ps.setString(i++, empleado.getDv());
            ps.setString(i++, empleado.getNombres());
            ps.setString(i++, empleado.getApellidoPaterno());
            ps.setString(i++, empleado.getApellidoMaterno());
            ps.setInt(i++, empleado.getTelefono());
            ps.setString(i++, empleado.getTipoEmpleado().getNombreTipoEmpleado());
            ps.setInt(i++, empleado.getTipoEmpleado().getCodigo());
            
            ps.execute();
            
            resultado = true;
        }catch(SQLException ex ){
        
            ex.printStackTrace();
        }
        
        return resultado;
    }
    
    
    public boolean actualizar(Empleado empleado){
    
        boolean resultado = false;
        String query = "UPDATE EMPLEADO SET NOMBRES = ?, APELLIDOPATERNO = ?, "
                + "APELLIDOMATERNO = ?, TELEFONO = ?, NOMBRETIPOEMPLEADO = ?,CODIGO =?   WHERE RUT = ? and DV = ?"; 
        try{
            PreparedStatement  ps = ConexionDAO.getConnection().prepareStatement(query);
            
            int i = 1;
                
            ps.setString(i++, empleado.getNombres());
            ps.setString(i++, empleado.getApellidoPaterno());
            ps.setString(i++, empleado.getApellidoMaterno());
            ps.setInt(i++, empleado.getTelefono());
            ps.setString(i++, empleado.getTipoEmpleado().getNombreTipoEmpleado());
            ps.setInt(i++, empleado.getTipoEmpleado().getCodigo());
            ps.setString(i++, empleado.getRut());
            ps.setString(i++, empleado.getDv());
            
            ps.execute();
            
            resultado = true;
        }catch(SQLException ex ){
        
            ex.printStackTrace();
        }        
        
        return resultado;
    }
    
    /**
     * Método borrar según rut
     * @param rut
     * @param dv
     * @return 
     */
    public boolean borrar(String rut, String dv){
    
        boolean resultado = false;
        
        String query = "DELETE FROM EMPLEADO WHERE RUT = ? and DV = ?";
    
        try{
        
            PreparedStatement  ps = ConexionDAO.getConnection().prepareStatement(query);
            int i = 1;
            ps.setString(i++, rut);
            ps.setString(i++, dv);
            
            ps.execute();
            resultado = true;
            
        }catch(Exception ex){
        
            ex.printStackTrace();
        }

        return resultado;
    }
    
    public List<Empleado> listar(){
    
        List<Empleado> empleados = new ArrayList<>();
        
        String query = "SELECT RUT, DV, NOMBRES, APELLIDOPATERNO, "
                + "APELLIDOMATERNO, TELEFONO, NOMBRETIPOEMPLEADO, CODIGO FROM EMPLEADO";

        try{
        
            PreparedStatement  ps = ConexionDAO.getConnection().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                
                Empleado emp = new Empleado();
                emp.setRut(rs.getString("RUT"));
                emp.setDv(rs.getString("DV"));
                emp.setNombres(rs.getString("NOMBRES"));
                emp.setApellidoPaterno(rs.getString("APELLIDOPATERNO"));
                emp.setApellidoMaterno(rs.getString("APELLIDOMATERNO"));
                emp.setTelefono(rs.getInt("TELEFONO"));
                TipoEmpleado tp = new TipoEmpleado();
                tp.setNombreTipoEmpleado(rs.getString("NOMBRETIPOEMPLEADO"));
                tp.setCodigo(rs.getInt("CODIGO"));
                
                emp.setTipoEmpleado(tp);
                empleados.add(emp);
                
                
            }
            
        }catch(Exception ex){
        
            ex.printStackTrace();
        }
        
        return empleados;
    }
    
    public Empleado buscarPorRut(String rut, String dv){
    
        Empleado emp = null;
        
        String query = "SELECT RUT, DV, NOMBRES, APELLIDOPATERNO, APELLIDOMATERNO, TELEFONO,NOMBRETIPOEMPLEADO, CODIGO FROM EMPLEADO WHERE RUT = ? and DV = ?" 
               ;        
        
        try{
        
            PreparedStatement  ps = ConexionDAO.getConnection().prepareStatement(query);
            
            int i = 1;
            ps.setString(i++, rut);
            ps.setString(i++, dv);
                        
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                
                emp = new Empleado();
                emp.setRut(rs.getString("RUT"));
                emp.setDv(rs.getString("DV"));
                emp.setNombres(rs.getString("NOMBRES"));
                emp.setApellidoPaterno(rs.getString("APELLIDOPATERNO"));
                emp.setApellidoMaterno(rs.getString("APELLIDOMATERNO"));
                emp.setTelefono(rs.getInt("TELEFONO"));
                TipoEmpleado tp = new TipoEmpleado();
                tp.setNombreTipoEmpleado(rs.getString("NOMBRETIPOEMPLEADO"));
                tp.setCodigo(rs.getInt("CODIGO"));
                //Agregar direccion al paciente
                emp.setTipoEmpleado(tp);             
            }
            
        }catch(Exception ex){
        
            ex.printStackTrace();
        }
        
        return emp;
    }
    
}
