/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScoopsAhoy;

import java.util.Comparator;

/**
 *
 * @author Maty
 */
public class comparatorProveedorporraz√≥nSocial implements Comparator<Factura>{

    @Override
    public int compare(Factura o1, Factura o2) {
        return ((o1.getProveedor().getRaz√≥nSocial()).compareTo(o2.getProveedor().getRaz√≥nSocial()));
    }
    
}
