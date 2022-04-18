/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScoopsAhoy;

import java.util.Objects;

/**
 *
 * @author Maty
 */
public class Producto {
    private int Código;
    private String Descripción;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.Código;
        hash = 19 * hash + Objects.hashCode(this.Descripción);
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
        final Producto other = (Producto) obj;
        if (this.Código != other.Código) {
            return false;
        }
        return Objects.equals(this.Descripción, other.Descripción);
    }

    @Override
    public String toString() {
        return "Producto{" + "Código=" + Código + ", Descripción=" + Descripción + '}';
    }

    public Producto(int Código, String Descripción) {
        this.Código = Código;
        this.Descripción = Descripción;
    }
   
    
    
}
