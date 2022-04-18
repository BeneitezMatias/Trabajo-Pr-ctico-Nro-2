/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.Objects;

/**
 *
 * @author Maty
 */
public class Cliente implements Comparable<Cliente> {

private String Apellido;
private String Nombre;
private String Documento;
private ClienteTipoEnum Tipo;

    Cliente() {
    }

    public ClienteTipoEnum getTipo() {
        return Tipo;
    }

    public void setTipo(ClienteTipoEnum Tipo) {
        this.Tipo = Tipo;
    }

    

public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    

@Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.Apellido);
        hash = 37 * hash + Objects.hashCode(this.Nombre);
        hash = 37 * hash + Objects.hashCode(this.Documento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.Apellido, other.Apellido)) {
            return false;
        }
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        return Objects.equals(this.Documento, other.Documento);
    }

    @Override
    public String toString() {
        return "Cliente{" + "Apellido=" + Apellido + ", Nombre=" + Nombre + ", Documento=" + Documento + ", Tipo=" + Tipo + '}';
    }

    public Cliente(String Apellido, String Nombre, String Documento, ClienteTipoEnum Tipo) {
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.Documento = Documento;
        this.Tipo = Tipo;
    }

    @Override
    public int compareTo(Cliente o) {
        if(this.Apellido.compareTo(o.getApellido())== 0){
            if(this.Nombre.compareTo(o.getNombre())== 0){
                return this.Documento.compareTo(o.getDocumento());
            }else{return this.Nombre.compareTo(o.getNombre());}
        }else{return this.Apellido.compareTo(o.getApellido());}
    }



    
}
