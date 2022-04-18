/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScoopsAhoy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Maty
 */
public class FacturasAdmin extends FacturasAdminAbstract{

    @Override
    public List<Factura> buscarFacturasPorMesAnio(int mes, int anio) {
        List<Factura> lista =new ArrayList();
        for(Factura factura : this.facturasList){
        if(factura.getFecha().getMonthValue() == mes){
                if(factura.getFecha().getYear() == anio ){
                   lista.add(factura); 
                }     
            }    
        }
        return lista;
    }

    @Override
    public List<Factura> buscarFacturasPorProveedor(Empresa empresa) {
       List<Factura> listaf =new ArrayList();
       for(Factura factura : this.facturasList ){
        boolean b = (factura.getProveedor().getCuit().equals(empresa.getCuit()));
        if(b=true){
            listaf.add(factura);    
           }
       }  
       return listaf;
    }

    @Override
    public Factura facturaMasCostosa() {
       return Collections.max(this.facturasList,new Comparator<Factura>() {
           @Override
           public int compare(Factura o1, Factura o2) {
               return o1.getImporteTotal().compareTo(o2.getImporteTotal());
           }
       });
    }
    

    @Override
    public List<ProductoCantidad> top5ProductoCantidad() {
        List<ProductoCantidad> listc = new ArrayList();
        Collections.sort(listc);
        for(int i=5;i<listc.size();i++){  
           listc.remove(i);
           }
        return listc;
        }
        
    }
    

