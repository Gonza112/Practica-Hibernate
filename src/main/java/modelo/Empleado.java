/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Gerardo
 */
@MappedSuperclass
@Getter @Setter
public abstract class Empleado  extends EntidadId{
    
    protected String apellido;
    protected String nombre;
    @Column ( nullable = false, unique = true)
    protected int legajo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "iddatoscontacto")
    protected DatosContacto datosContacto;// 1 a 1
    @Column (nullable = false)
    protected String Estado; // activo o inactivo
}
