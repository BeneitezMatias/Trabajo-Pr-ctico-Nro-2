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
public class Sucursal {
    private String Nombre;
    private String Dirección;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public Sucursal(String Nombre, String Dirección) {
        this.Nombre = Nombre;
        this.Dirección = Dirección;
    }
    
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.Nombre);
        hash = 97 * hash + Objects.hashCode(this.Dirección);
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
        final Sucursal other = (Sucursal) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        return Objects.equals(this.Dirección, other.Dirección);
    }

    @Override
    public String toString() {
        return "Sucursal{" + "Nombre=" + Nombre + ", Dirección=" + Dirección + '}';
    }
    
    
    
    
}
