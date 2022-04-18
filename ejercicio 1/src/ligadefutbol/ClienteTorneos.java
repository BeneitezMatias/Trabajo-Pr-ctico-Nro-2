/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ligadefutbol;

/**
 *
 * @author Maty
 */
public class ClienteTorneos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TorneosAdmin torneosadmin = new TorneosAdmin();
        EquipoTorneo e = new EquipoTorneo ();
        e.getDiferenciaGol(30, 20);
        e.getPuntos(14, 20);
        
         System.out.println("=====================");
        torneosadmin.agregar(new EquipoTorneo(new Equipo("ABERDE"),new Torneo("SUPERTORNEO",2011),15,5,3,7,15,23));
        torneosadmin.agregar(new EquipoTorneo(new Equipo("RESTUR"),new Torneo("SUPERTORNEO",2010),15,7,5,3,22,10));
        torneosadmin.agregar(new EquipoTorneo(new Equipo("TERUY"),new Torneo("TORNEOFEDERAL",2011),20,10,3,7,18,9));
        torneosadmin.agregar(new EquipoTorneo(new Equipo("UTUR"),new Torneo("SUPERTORNEO",2011),15,10,0,5,27,18));
        
       System.out.println("=====================");
        System.out.println(torneosadmin.toString());
        
        System.out.println("lista ordenada");
        System.out.println("=====================");
        torneosadmin.ordenar();
        
        System.out.println(torneosadmin.toString());
        
        torneosadmin.masGoleador();
        
        Torneo t = new Torneo("SUPERTORNEO",2011);
        torneosadmin.tablaPosiciones(t);
        
        torneosadmin.vallaMenosVencida();
        Equipo equi = new Equipo("UTUR");
        torneosadmin.todosLosTorneos(equi);
        
        
        
       
       
        
    }
   
    }
    
