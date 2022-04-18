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
public class ProductoCantidad implements Comparable<ProductoCantidad>{
    
    private String Nombre;
    private String id;
    private int cantidaddeventas;

    public ProductoCantidad(String Nombre, String id, int cantidaddeventas) {
        this.Nombre = Nombre;
        this.id = id;
        this.cantidaddeventas = cantidaddeventas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final ProductoCantidad other = (ProductoCantidad) obj;
        return Objects.equals(this.id, other.id);
    }



    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidaddeventas() {
        return cantidaddeventas;
    }

    public void setCantidaddeventas(int cantidaddeventas) {
        this.cantidaddeventas = cantidaddeventas;
    }

    @Override
    public String toString() {
        return "ProductoCantidad{" + "Nombre=" + Nombre + ", id=" + id + ", cantidaddeventas=" + cantidaddeventas + '}';
    }

    @Override
    public int compareTo(ProductoCantidad o) {
        return Integer.valueOf(this.cantidaddeventas.compareTo(o.getCantidaddeventas()));
    }
    
    
    
}
