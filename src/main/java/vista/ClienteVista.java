/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import controlador.Gestor;
import controlador.GestorCliente;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.DatosContacto;
import modelo.EntidadId;

/**
 *
 * @author gonza
 */
public class ClienteVista extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            if (columna > 0) {
                return false;
            } else {
                return true;
            }
        }
    };

    /**
     * Creates new form Cliente
     */
    public ClienteVista() {
        initComponents();
        CargarListCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtrazonsocial = new javax.swing.JTextField();
        jtcelular = new javax.swing.JTextField();
        jttelefono = new javax.swing.JTextField();
        jtemail = new javax.swing.JTextField();
        jtcuit = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        restado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtcliente = new javax.swing.JTable();

        setClosable(true);
        setResizable(true);

        jLabel1.setText("Razon social");

        jLabel2.setText("Cuit");

        jLabel3.setText("Celular");

        jLabel4.setText("Telefono");

        jLabel5.setText("Email");

        jtcelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcelularActionPerformed(evt);
            }
        });

        jtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtemailActionPerformed(evt);
            }
        });

        jtcuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcuitActionPerformed(evt);
            }
        });

        jButton1.setText("Nuevo Cliente");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar Cliente");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Eliminar.setText("Dar de Baja");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        restado.setSelected(true);

        jLabel6.setText("Estado");

        jtcliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jtcliente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jtclienteMouseDragged(evt);
            }
        });
        jtcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtclienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtcliente);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGap(27, 27, 27)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jtcuit, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Buscar))
                                .addComponent(jtrazonsocial, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(restado))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton1)
                            .addGap(34, 34, 34)
                            .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(Eliminar))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtrazonsocial)
                    .addComponent(jLabel1))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtcuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(restado))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminar)
                    .addComponent(jButton1)
                    .addComponent(Modificar))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        buscarCliente();
    }//GEN-LAST:event_BuscarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        GestorCliente gCliente = new GestorCliente();
        DatosContacto dcontacto = new DatosContacto();
        Cliente clientec = new Cliente();
        int selec = jtcliente.getSelectedRow();
        try {
            if (selec != -1) {
                long idC = (long) jtcliente.getValueAt(selec, 0);
                String razonSocial = (String) jtcliente.getValueAt(selec, 1);
                long cuit = (long) jtcliente.getValueAt(selec, 2);
                long telefono = (long) jtcliente.getValueAt(selec, 3);
                long ceular = (long)jtcliente.getValueAt(selec, 4);
                String email = (String) jtcliente.getValueAt(selec, 5);
                
                dcontacto.setId(idC);
                dcontacto.setCelular(ceular);
                dcontacto.setTelefono(telefono);
                dcontacto.setEmail(email);
                
                clientec.setId(idC);
                clientec.setCuit(cuit);
                clientec.setRazonSocial(razonSocial);
                clientec.setEstado("inactivo");
                clientec.setDatosContacto(dcontacto);
                gCliente.guardarCliente(clientec);
               } 
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al dar de baja al cliente");
            }
        
    }//GEN-LAST:event_EliminarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        
        GestorCliente gCliente = new GestorCliente();
        DatosContacto dContacto = new DatosContacto();

        int selec = jtcliente.getSelectedRow();
        try {
            long idC = (long) jtcliente.getValueAt(selec, 0);
            long cuit = (long) jtcliente.getValueAt(selec, 2);
            String rasonSocial = jtrazonsocial.getText();
            long cuitM = Long.parseLong(jtcuit.getText());
            long celular = Long.parseLong(jtcelular.getText());
            long telefono = Long.parseLong(jttelefono.getText());
            String email = jtemail.getText();
            String estado = restado.isSelected() ? "activo" : "inactivo";
            
            Cliente clientec = gCliente.getClienteXCuit(cuit);
            long idDatos = clientec.getDatosContacto().getId();
            
            if (clientec == null){
            JOptionPane.showMessageDialog(null, "Error al modificar, cliente no existe");
         
            } else {

            clientec.setCuit(cuitM);
            clientec.setRazonSocial(rasonSocial);
            clientec.setEstado(estado);
            
            dContacto.setId(idDatos);
            dContacto.setCelular(celular);
            dContacto.setTelefono(telefono);
            dContacto.setEmail(email);

            clientec.setDatosContacto(dContacto);
            gCliente.modificarCliente(clientec);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar");
            ex.printStackTrace();

        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cliente clientec = new Cliente();
        GestorCliente gCliente = new GestorCliente();
        DatosContacto dContactos = new DatosContacto();
        try {
            String rasonSocial = jtrazonsocial.getText();
            long cuit = Long.parseLong(jtcuit.getText());
            long celular = Long.parseLong(jtcelular.getText());
            long telefono = Long.parseLong(jttelefono.getText());
            String email = jtemail.getText();
            String estado = restado.isSelected() ? "activo" : "inactivo";

            clientec.setCuit(cuit);
            clientec.setRazonSocial(rasonSocial);
            clientec.setEstado(estado);
            dContactos.setCelular(celular);
            dContactos.setTelefono(telefono);
            dContactos.setEmail(email);
            clientec.setDatosContacto(dContactos);
            gCliente.guardarCliente(clientec);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jtcuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtcuitActionPerformed

    private void jtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtemailActionPerformed

    private void jtcelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtcelularActionPerformed

    private void jtclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtclienteMouseClicked
        int selec = jtcliente.getSelectedRow();

        if (selec != -1) {
            String razonSocial = (String) jtcliente.getValueAt(selec, 1);
            long cuit = (long) jtcliente.getValueAt(selec, 2);
            long telefono = (long) jtcliente.getValueAt(selec, 3);
            long celular = (long) jtcliente.getValueAt(selec, 4);
            String email = (String) jtcliente.getValueAt(selec, 5);
            String Estado = (String) jtcliente.getValueAt(selec, 6);
            jtrazonsocial.setText(razonSocial);
            jtcuit.setText(cuit + "");
            jttelefono.setText(telefono + "");
            jtcelular.setText(celular + "");
            jtemail.setText(email);
            if (Estado.equals("activo")) {
                restado.setSelected(true);
            } else {
                restado.setSelected(false);
            }

        }

    }//GEN-LAST:event_jtclienteMouseClicked

    private void jtclienteMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtclienteMouseDragged

    }//GEN-LAST:event_jtclienteMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtcelular;
    private javax.swing.JTable jtcliente;
    private javax.swing.JTextField jtcuit;
    private javax.swing.JTextField jtemail;
    private javax.swing.JTextField jtrazonsocial;
    private javax.swing.JTextField jttelefono;
    private javax.swing.JRadioButton restado;
    // End of variables declaration//GEN-END:variables

    public void buscarCliente() {

        GestorCliente gCliente = new GestorCliente();
        long cuit = Long.parseLong(jtcuit.getText());

        try {
            Cliente clientec = gCliente.listarCuitCliente(cuit);

            if (clientec != null) {
                modelo.addRow(new Object[]{clientec.getId(), clientec.getRazonSocial(), clientec.getCuit(), clientec.getDatosContacto().getTelefono(),
                    clientec.getDatosContacto().getCelular(), clientec.getDatosContacto().getEmail(), clientec.getEstado()});
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    public void CargarListCliente() {
        modelo.addColumn("idCliente");
        modelo.addColumn("Razon Social");
        modelo.addColumn("Cuit");
        modelo.addColumn("Telefono");
        modelo.addColumn("Celular");
        modelo.addColumn("Email");
        modelo.addColumn("Estado");
        jtcliente.setModel(modelo);
    }
}
