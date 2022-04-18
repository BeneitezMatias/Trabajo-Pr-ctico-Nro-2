/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligadefutbol;

import java.util.Objects;

public class Equipo {
    private String Nombre;
    private Ciudad Ciudad;

    public Equipo(String Nombre) {
        this.Nombre = Nombre;
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
        final Equipo other = (Equipo) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        return Objects.equals(this.Ciudad, other.Ciudad);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.Nombre);
        hash = 29 * hash + Objects.hashCode(this.Ciudad);
        return hash;
    }

    @Override
    public String toString() {
        return "Equipo{" + "Nombre=" + Nombre + ", Ciudad=" + Ciudad + '}';
    }

    public Equipo(String Nombre, Ciudad Ciudad) {
       
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
 
    
}
