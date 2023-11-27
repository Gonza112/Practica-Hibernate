/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.utn.trabajofinalargprograma;



import controlador.GestorCliente;
import controlador.GestorGenerico;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
import modelo.DatosContacto;
import modelo.Especialidad;
import modelo.OperadorMesaAyuda;

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
//           GestorGenerico gGenerico = new GestorGenerico();
////          Cliente clientec = gCliente.getClienteXCuit(56165122);
////          System.out.println(""+clientec.getDatosContacto().getId());
//
//               int legajo = 88601;
//    
//              OperadorMesaAyuda operador = (OperadorMesaAyuda) gGenerico.buscarObjetoPorAtributo(OperadorMesaAyuda.class, "legajo" , legajo);
//                long idC = operador.getDatosContacto().getId();
//        System.out.println("" + idC);

//       Object apell = "perez";
//       
//        List<OperadorMesaAyuda> operador  =   gGenerico.buscarPorAtributo1(OperadorMesaAyuda.class, "apellido", apell);
//            for(OperadorMesaAyuda ope : operador){
//                System.out.println(ope.getApellido() + " - " + ope.getLegajo());
//            }
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
