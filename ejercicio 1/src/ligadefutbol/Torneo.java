/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligadefutbol;

import java.util.Objects;

public class Torneo implements Comparable<Torneo>{
    private String Nombre;
    private int Año;

    
    @Override
    public int hashCode() {
        int hash = 5;
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
        final Torneo other = (Torneo) obj;
        if (this.Año != other.Año) {
            return false;
        }
        return Objects.equals(this.Nombre, other.Nombre);
    }

    @Override
    public String toString() {
        return "Torneo{" + "Nombre=" + Nombre + ", Año=" + Año + '}';
    }

    public Torneo(String Nombre, int Año) {
        
        this.Nombre = Nombre;
        this.Año = Año;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    @Override
    public int compareTo(Torneo o) {
        if(this.Año == o.getAño()){
            return(this.Nombre.compareTo(o.getNombre()));
        }else{
            return Integer.valueOf(this.Año.compareTo(o.getAño()));
        }
    }
    
    
    
}
