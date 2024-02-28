/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Tema2GestorClientes.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Cliente {

    private String nombre;
    private String apellidos;
    private Date fechaAlta;
    private String provincia;

    // Constructor
    public Cliente(String nombre, String apellidos, Date fechaAlta, String provincia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaAlta = fechaAlta;
        this.provincia = provincia;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    public String[] toArrayStrings() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String[] unCliente = new String[4];
        
        unCliente[0] = getNombre();
        unCliente[1] = getApellidos();
        unCliente[2] = sdf.format(getFechaAlta());
        unCliente[3] = getProvincia();
        
        return unCliente;
    }


}
