/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.utn.trabajofinalargprograma;



import controlador.GestorCliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
import modelo.DatosContacto;

/**
 *
 * @author Gerardo
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
////         TODO code application logic here
//        Cliente Cliente = new Cliente();
//        GestorCliente gCliente = new GestorCliente();
//////    
//          Cliente clientec = gCliente.getClienteXCuit(56165122);
//          System.out.println(""+clientec.getDatosContacto().getId());


        
//        try {
//            obtenerConexion();
//             System.out.println("BASE DE DATOS GENERADA");
//        } catch (SQLException ex) {
//            System.out.println("Error");
//        }
//         try {
//        GestorCliente gCliente = new GestorCliente();
//        Cliente cliente = gCliente.cargarClienteNuevo();
//            gCliente.guardarCliente(cliente);
//        } catch (Exception ex) {
//             System.out.println("Error al guardar");
//        }
        
//        System.out.println(""+gCliente.listarCliente(Cliente));
        
}
    
    

     
     public static void obtenerConexion() throws SQLException{
        Connection con = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/argentina_programa?useTimezone=true&serverTimezone=UTC","root","14751475");
        if(con != null){
            System.out.println("CONECTADO");
        }
        } catch (Exception ex) {
            ex.printStackTrace();
  
        }
     }
}
