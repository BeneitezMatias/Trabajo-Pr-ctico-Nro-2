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
public class Credito implements Comparable<Credito>{
   private int Número;
   private CréditoTipo Tipo;
   private Cliente Cliente;
   private Double Montoacordado;
   private int Plazoenaños;
   private Sucursal Sucursal;
   private Double Totaladevolver;

    public Sucursal getSucursal() {
        return Sucursal;
    }

    public void setSucursal(Sucursal Sucursal) {
        this.Sucursal = Sucursal;
    }

   
   public CréditoTipo getTipo() {
        return Tipo;
    }

    public void setTipo(CréditoTipo Tipo) {
        this.Tipo = Tipo;
    }   
   
   public int getNúmero() {
        return Número;
    }

    public void setNúmero(int Número) {
        this.Número = Número;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public Double getTotaladevolver() {
        return Totaladevolver;
    }
   
   @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.Número;
        hash = 37 * hash + Objects.hashCode(this.Cliente);
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
        final Crédito other = (Crédito) obj;
        if (this.Número != other.Número) {
            return false;
        }
        return Objects.equals(this.Cliente, other.Cliente);
    }

    public Crédito(int Número, CréditoTipo Tipo, Cliente Cliente, Double Montoacordado, int Plazoenaños, Sucursal Sucursal) {
        this.Número = Número;
        this.Tipo = Tipo;
        this.Cliente = Cliente;
        this.Montoacordado = Montoacordado;
        this.Plazoenaños = Plazoenaños;
        this.Sucursal = Sucursal;
        this.Totaladevolver = calculartotal();
    }

    @Override
    public String toString() {
        return "Crédito{" + "Número=" + Número + ", Tipo=" + Tipo + ", Cliente=" + Cliente + ", Montoacordado=" + Montoacordado + ", Plazoenaños=" + Plazoenaños + ", Sucursal=" + Sucursal + ", Totaladevolver=" + Totaladevolver + '}';
    }

   public Double calculartotal(Double Montoacordado,CréditoTipo Tipo){
       Totaladevolver=Montoacordado+(Montoacordado*this.Tipo.getTasadeInterés());
   }  
    
    @Override
    public int compareTo(Credito o) {
        return Integer.valueOf(this.Número.compareTo(o.getNúmero()))
    }
   
   
}
