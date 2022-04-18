/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Maty
 */
public enum ClienteTipoEnum {
   Persona, 
   Comercio, 
   EmpresadeConstrucción;
   
    private final String descripción;
    
    private ClienteTipoEnum(String descripción){
        this.descripción = descripción;
    }

    @Override
    public String toString() {
        return "ClienteTipoEnum{" + "descripción=" + descripción + '}';
    }
    
}
