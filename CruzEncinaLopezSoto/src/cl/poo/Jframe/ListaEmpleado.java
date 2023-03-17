/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.poo.Jframe;



import cl.poo.Clases.Empleado;
import cl.poo.Conexion.ConexionDAO;
import cl.poo.Conexion.EmpleadoDAO;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ismal
 */
public class ListaEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form ListaEmpleado
     */
    
    
     public ListaEmpleado() {
        initComponents();
        this.getContentPane().setBackground(Color.CYAN);
        EmpleadoDAO dao = new EmpleadoDAO();
        List<Empleado> listadoEmpleado = dao.listar();
        System.out.println("CANTIDAD DE EMPLEADOS -> " + listadoEmpleado.size());
        
        tblEmpleado.setModel(new DefaultTableModel(
                   new String[]{"RUT",
                        "DV",
                        "NOMBRES",
                        "APELLIDOPATERNO",
                        "APELLIDOMATERNO",
                        "TELEFONO",
                        "NOMBRETIPOEMPLEADO",
                        "CODIGO",
                        }, listadoEmpleado.size()
                ));
        
        for(int i = 0; i < listadoEmpleado.size(); i++){
            
            tblEmpleado.setValueAt(listadoEmpleado.get(i).getRut(), i, 0);
            tblEmpleado.setValueAt(listadoEmpleado.get(i).getDv(),i,1);
            tblEmpleado.setValueAt(listadoEmpleado.get(i).getNombres(), i, 2);
            tblEmpleado.setValueAt(listadoEmpleado.get(i).getApellidoPaterno(), i, 3);
            tblEmpleado.setValueAt(listadoEmpleado.get(i).getApellidoMaterno(), i, 4);
            tblEmpleado.setValueAt(listadoEmpleado.get(i).getTelefono(), i, 5);
            tblEmpleado.setValueAt(listadoEmpleado.get(i).getTipoEmpleado().getNombreTipoEmpleado(),i,6);
            tblEmpleado.setValueAt(listadoEmpleado.get(i).getTipoEmpleado().getCodigo(),i,7);
                               
        }
 
     }

     
     
     

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        btnBuscarRut = new javax.swing.JButton();
        txtBuscarRut = new javax.swing.JTextField();
        txtBuscarDv = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo.setText("LISTAR EMPELADO REGISTRADOS");

        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblEmpleado);

        btnBuscarRut.setText("BUSCAR");
        btnBuscarRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnAtras))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(49, 49, 49)
                .addComponent(txtBuscarRut, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscarDv, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnBuscarRut)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarRut)
                    .addComponent(lblTitulo)
                    .addComponent(txtBuscarRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarDv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        FormularioeEmpleado fe = new FormularioeEmpleado();
        fe.setVisible(true);
        this.setVisible(false);
        
        
        
        
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnBuscarRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRutActionPerformed
        EmpleadoDAO dao = new EmpleadoDAO();
        
        if("".equals(txtBuscarRut.getText())){
            List<Empleado> listadoEmpleado = dao.listar();
            System.out.println("CANTIDAD DE PERSONAS -> " + listadoEmpleado.size());

            tblEmpleado.setModel(new DefaultTableModel(
                       new String[]{"RUT",
                        "DV",
                        "NOMBRES",
                        "APELLIDOPATERNO",
                        "APELLIDOMATERNO",
                        "TELEFONO",
                        "NOMBRETIPOEMPLEADO",
                        "CODIGO",
                            }, listadoEmpleado.size()
                    ));

            for(int i = 0; i < listadoEmpleado.size(); i++){

                tblEmpleado.setValueAt(listadoEmpleado.get(i).getRut(), i, 0);
                tblEmpleado.setValueAt(listadoEmpleado.get(i).getDv(),i,1);
                tblEmpleado.setValueAt(listadoEmpleado.get(i).getNombres(), i, 2);
                tblEmpleado.setValueAt(listadoEmpleado.get(i).getApellidoPaterno(), i, 3);
                tblEmpleado.setValueAt(listadoEmpleado.get(i).getApellidoMaterno(), i, 4);
                tblEmpleado.setValueAt(listadoEmpleado.get(i).getTelefono(), i, 5);
                tblEmpleado.setValueAt(listadoEmpleado.get(i).getTipoEmpleado().getNombreTipoEmpleado(),i,6);
                tblEmpleado.setValueAt(listadoEmpleado.get(i).getTipoEmpleado().getCodigo(),i,7);                      
            }        
        }else{
            Empleado empleado = dao.buscarPorRut(txtBuscarRut.getText(),txtBuscarDv.getText());

            tblEmpleado.setModel(new DefaultTableModel(
                       new String[]{"RUT",
                        "DV",
                        "NOMBRES",
                        "APELLIDOPATERNO",
                        "APELLIDOMATERNO",
                        "TELEFONO",
                        "NOMBRETIPOEMPLEADO",
                        "CODIGO",
                            }, 1
                    ));

            if(empleado != null){
                tblEmpleado.setValueAt(empleado.getRut(), 0, 0);
                tblEmpleado.setValueAt(empleado.getDv(),0,1);
                tblEmpleado.setValueAt(empleado.getNombres(), 0, 2);
                tblEmpleado.setValueAt(empleado.getApellidoPaterno(), 0, 3);
                tblEmpleado.setValueAt(empleado.getApellidoMaterno(), 0, 4);
                tblEmpleado.setValueAt(empleado.getTelefono(), 0, 5);
                tblEmpleado.setValueAt(empleado.getTipoEmpleado().getNombreTipoEmpleado(),0,6);
                tblEmpleado.setValueAt(empleado.getTipoEmpleado().getCodigo(),0,7);               
            }             
        }
        
                  
         
    }//GEN-LAST:event_btnBuscarRutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscarRut;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtBuscarDv;
    private javax.swing.JTextField txtBuscarRut;
    // End of variables declaration//GEN-END:variables
}
