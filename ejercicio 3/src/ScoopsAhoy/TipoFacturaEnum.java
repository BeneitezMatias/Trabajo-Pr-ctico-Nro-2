/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScoopsAhoy;

/**
 *
 * @author Maty
 */
 public enum TipoFacturaEnum {
    FacturaA("FacturaA"), 
    FacturaB("FacturaB"), 
    FacturaC("FacturaC");
    
    private final String descripción;
    private TipoFacturaEnum(String descripción){
        this.descripción = descripción;
    }

    @Override
    public String toString() {
        return "TipoFacturaEnum{" + "descripción=" + descripción + '}';
    }
    
    

    
}
