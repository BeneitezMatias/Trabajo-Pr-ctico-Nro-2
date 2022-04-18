/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Maty
 */
public class CreditosAdmin extends CreditoAdminAbstract {

    @Override
    public void ordenar() {
        Collections.sort(this.creditosList);
    }

    @Override
    public void ordenar(Comparator comparator) {
        Collections.sort(this.creditosList, comparator);   
    }

    @Override
    public String toString() {
        String resultado = "";
        for (Credito c : creditosList) { resultado += c.toString(); }
        return resultado;
    }

    @Override
    public List<Credito> creditosPorClienteTipo(ClienteTipoEnum tipo) {
        List<Credito> resultado= new ArrayList();
        for(Credito credito : this.creditosList){
            Cliente cliente = new Cliente();
            if(cliente.getTipo() == tipo){
                resultado.add(credito); 
            }
        }
        return resultado;
    }

    @Override
    public List<Credito> creditosPorCreditoTipoySucursal(CréditoTipo tipo, Sucursal sucursal) {
        List<Credito> salida = new ArrayList();
          for(Credito credito : this.creditosList){
           if(credito.getTipo()==tipo) {
               if(credito.getSucursal().getNombre().equals(sucursal.getNombre())){
                   if(credito.getSucursal().getDirección().equals(sucursal.getDirección())){
                       salida.add(credito);
                   }  
               }
           }  
          }
        return salida;
    }

    @Override
    public List<Credito> creditosInferioresA(double monto) {
        List<Credito> lista = new ArrayList();
          for(Credito credito : this.creditosList){
              if(credito.getTotaladevolver()< monto){
                  lista.add(credito);
              }
          }
    return lista;
    }
    

    @Override
    public List<Credito> creditosSuperioresA(double monto) {
          List<Credito> lis = new ArrayList();
          for(Credito credito : this.creditosList){
              if(credito.getTotaladevolver()> monto){
                  lis.add(credito);
              }
          }
    return lis;
    }
    
}
