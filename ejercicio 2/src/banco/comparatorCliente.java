/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.Comparator;

/**
 *
 * @author Maty
 */
public class comparatorCliente implements Comparator<Credito> {

    @Override
    public int compare(Credito o1, Credito o2) {
        return o1.compareTo(o2);
    }
    
}
