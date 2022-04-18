/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScoopsAhoy;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Maty
 */
public class Factura implements Comparable<Factura>  {
    private TipoFacturaEnum TipodeFactura;
    private int PuntodeVenta;
    private int Número;
    private LocalDate Fecha;
    private Empresa Proveedor;
    private List<FacturaDetalle> DetalleFactura;
    private Float ImporteTotal;

    public int getNúmero() {
        return Número;
    }

    public void setNúmero(int Número) {
        this.Número = Número;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public Empresa getProveedor() {
        return Proveedor;
    }

    public void setProveedor(Empresa Proveedor) {
        this.Proveedor = Proveedor;
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.Número;
        hash = 53 * hash + Objects.hashCode(this.Fecha);
        hash = 53 * hash + Objects.hashCode(this.Proveedor);
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
        final Factura other = (Factura) obj;
        if (this.Número != other.Número) {
            return false;
        }
        if (!Objects.equals(this.Fecha, other.Fecha)) {
            return false;
        }
        return Objects.equals(this.Proveedor, other.Proveedor);
    }

    public Float getImporteTotal() {
        return ImporteTotal;
    }

    public void setImporteTotal(Float ImporteTotal) {
        this.ImporteTotal = ImporteTotal;
    }

    public int getPuntodeVenta() {
        return PuntodeVenta;
    }

    public void setPuntodeVenta(int PuntodeVenta) {
        this.PuntodeVenta = PuntodeVenta;
    }

    @Override
    public String toString() {
        return "Factura{" + "TipodeFactura=" + TipodeFactura + ", PuntodeVenta=" + PuntodeVenta + ", Número=" + Número + ", Fecha=" + Fecha + ", Proveedor=" + Proveedor + ", DetalleFactura=" + DetalleFactura + ", ImporteTotal=" + ImporteTotal + '}';
    }

    public Factura(TipoFacturaEnum TipodeFactura, int PuntodeVenta, int Número, LocalDate Fecha, Empresa Proveedor, Float ImporteTotal) {
        this.TipodeFactura = TipodeFactura;
        this.PuntodeVenta = PuntodeVenta;
        this.Número = Número;
        this.Fecha = Fecha;
        this.Proveedor = Proveedor;
        this.DetalleFactura = DetalleFactura;
        this.ImporteTotal = ImporteTotal;
    }
    

    @Override
    public int compareTo(Factura o) {
        int salida=-1;
        boolean com;
        com =( o.getProveedor().equals(this.Proveedor));
            if(com=true){
                if(this.PuntodeVenta==o.getPuntodeVenta()){
                   return Integer.valueOf((this.Número).compareTo(o.getNúmero()))
                } 
            }else{
                salida=1;
            }
   return salida;
    }
    
 
}
