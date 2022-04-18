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
public class Empresa implements Comparable<Empresa>{
    private String Cuit;
    private String RazónSocial;
    private SituacionIVAEnum SituaciónIVA;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.Cuit);
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
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.Cuit, other.Cuit);
    }

    @Override
    public String toString() {
        return "Empresa{" + "Cuit=" + Cuit + ", RazónSocial=" + RazónSocial + ", SituaciónIVA=" + SituaciónIVA + '}';
    }

    public Empresa(String Cuit, String RazónSocial, SituacionIVAEnum SituaciónIVA) {
        this.Cuit = Cuit;
        this.RazónSocial = RazónSocial;
        this.SituaciónIVA = SituaciónIVA;
    }

    public String getCuit() {
        return Cuit;
    }

    public void setCuit(String Cuit) {
        this.Cuit = Cuit;
    }

    public String getRazónSocial() {
        return RazónSocial;
    }

    public void setRazónSocial(String RazónSocial) {
        this.RazónSocial = RazónSocial;
    }
    

    @Override
    public int compareTo(Empresa Proveedor) {
       return this.Cuit.compareTo(Proveedor.Cuit);
    }
    
    
}
