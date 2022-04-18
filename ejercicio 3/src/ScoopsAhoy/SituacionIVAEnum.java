/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScoopsAhoy;

/**
 *
 * @author Maty
 */
public enum SituacionIVAEnum {
    
    Inscripto("Inscripto"), 
    NOInscripto("NOInscripto"), 
    ConsumidorFinal("ConsumidorFinal"), 
    Monotributo("Monotributo");
    
    private final String descripción;
    private SituacionIVAEnum(String descripción){
        this.descripción = descripción;
    }

    @Override
    public String toString() {
        return "SituacionIVAEnum{" + "descripción=" + descripción + '}';
    }
    
}
