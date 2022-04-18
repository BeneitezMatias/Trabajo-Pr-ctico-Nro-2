/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author Maty
 */
public class ClienteCreditos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CreditosAdmin c = new CreditosAdmin();
       c.add(new Credito(12,new CréditoTipo("personal",1200.5,5000,2,5,ClienteTipoEnum.Persona,1.2),new Cliente("Alvarez","Jose","38765654",ClienteTipoEnum.Persona),1236,3,new Sucursal("RETUY","AV.Libertador 544")));
       c.add(new Credito(15,new CréditoTipo("empresa de construccion",10000,56000,5,10,ClienteTipoEnum.EmpresadeConstrucción,3),new Cliente("Benitez","Mario","40785954",ClienteTipoEnum.EmpresadeConstrucción),45670,7,new Sucursal("THUO","AV.Roque 766")));
       c.add(new Credito(10,new CréditoTipo("personal",1200.5,5000,2,5,ClienteTipoEnum.Persona,1.4),new Cliente("Espinoza","Eduardo","35995632",ClienteTipoEnum.Persona),1560,2,new Sucursal("GUIO","BROWN 1468")));
       c.add(new Credito(8,new CréditoTipo("comercio",5000,10000,2,7,ClienteTipoEnum.Comercio,2.0),new Cliente("Simon","Santiago","41785634",ClienteTipoEnum.Comercio),5600,5,new Sucursal("EOBO","AV.San Martin 1240")));
       c.add(new Credito(18,new CréditoTipo("personal",1200.5,5000,2,5,ClienteTipoEnum.Persona,1.2),new Cliente("Fernandez","Timoteo","36754690",ClienteTipoEnum.Persona),1700,2,new Sucursal("UYUPO","Vicente Lopez 760")));
  
       System.out.println(c.creditosList.toString());
       
       c.ordenar();
       
       c.creditosInferioresA(2000);
       
       c.creditosSuperioresA(1000);
       
       c.creditosPorCreditoTipoySucursal(tipo, sucursal);
       
       c.creditosPorClienteTipo("persona");
       
    }
    
}
