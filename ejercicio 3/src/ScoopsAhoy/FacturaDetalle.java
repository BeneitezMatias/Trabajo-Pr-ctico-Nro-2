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
public class FacturaDetalle {
    private int Númerodeítem;
    private Producto Producto;
    private int Cantidad;
    private Float PrecioUnitario;
    private Float SubTotal;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.Númerodeítem;
        hash = 73 * hash + Objects.hashCode(this.Producto);
        hash = 73 * hash + this.Cantidad;
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
        final FacturaDetalle other = (FacturaDetalle) obj;
        if (this.Númerodeítem != other.Númerodeítem) {
            return false;
        }
        if (this.Cantidad != other.Cantidad) {
            return false;
        }
        return Objects.equals(this.Producto, other.Producto);
    }

    @Override
    public String toString() {
        return "FacturaDetalle{" + "Númerodeítem=" + Númerodeítem + ", Producto=" + Producto + ", Cantidad=" + Cantidad + ", PrecioUnitario=" + PrecioUnitario + ", SubTotal=" + SubTotal + '}';
    }

    public FacturaDetalle(int Númerodeítem, Producto Producto, int Cantidad, Float PrecioUnitario, Float SubTotal) {
        this.Númerodeítem = Númerodeítem;
        this.Producto = Producto;
        this.Cantidad = Cantidad;
        this.PrecioUnitario = PrecioUnitario;
        this.SubTotal = SubTotal;
    }
    
    
    
    
    
    
}
