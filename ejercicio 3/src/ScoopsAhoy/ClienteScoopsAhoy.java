/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ScoopsAhoy;

/**
 *
 * @author Maty
 */
public class ClienteScoopsAhoy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FacturasAdmin f = new FacturasAdmin ();
       
        f.add(new Factura(TipoFacturaEnum.FacturaA,1,1,LocalDate.of(2012,3,5),new Empresa("345","tropo",SituacionIVAEnum.Inscripto),141a));
        f.add(new Factura(TipoFacturaEnum.FacturaB,3,10,LocalDate.of(2015,8,25),new Empresa("560","retop",SituacionIVAEnum.Inscripto), 0xfa));
        f.add(new Factura(TipoFacturaEnum.FacturaA,4,2,LocalDate.of(2016,10,15),new Empresa("754","etop",SituacionIVAEnum.ConsumidorFinal),1b16));
        f.add(new Factura(TipoFacturaEnum.FacturaB,2,13,LocalDate.of(2016,8,45),new Empresa("238","vitou",SituacionIVAEnum.NOInscripto),1e1d));
        
        f.ordenar();
        System.out.println(f.toString());
        
        f.facturaMasCostosa();
        f.buscarFacturasPorMesAnio(3,2012);
        Empresa empresa = new Empresa("754","etop",SituacionIVAEnum.ConsumidorFinal);
        f.buscarFacturasPorProveedor(empresa);
        f.top5ProductoCantidad();
        
    }
    
}
