/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligadefutbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Maty
 */
public class TorneosAdmin extends TorneoAdminAbstract{

    @Override
    public void agregar(EquipoTorneo equipoTorneo) {
        this.equipoTorneoList.add(equipoTorneo);
    }

    @Override
    public void ordenar() {
        Collections.sort(this.equipoTorneoList);
    }

    @Override
    public List<EquipoTorneo> tablaPosiciones(Torneo torneo) {
        List<EquipoTorneo> resultado = new ArrayList();
        for(EquipoTorneo equipo : this.equipoTorneoList){
            if (equipo.getTorneo().equals(torneo)){
                Collections.sort(resultado, new Comparator<EquipoTorneo>(){
                    @Override
                    public int compare(EquipoTorneo o1, EquipoTorneo o2) {
                        if(o1.getPuntos(o1.getPartidosGanados(),o1.getPartidosEmpatados())== o2.getPuntos(o2.getPartidosGanados(),o2.getPartidosEmpatados())){
                            return Integer.valueOf(o1.getDiferenciaGol(o1.getGolesaFavor(),o1.getGolesEnContra()).comapreTo(o2.getDiferenciaGol(o2.getGolesaFavor(),o2.getGolesEnContra()));
                        }else{
                            return Integer.valueOf((o1.getPuntos(o1.getPartidosGanados(),o1.getPartidosEmpatados()).compareTo(o2.getPuntos(o2.getPartidosGanados(),o2.getPartidosEmpatados()));
                        }       
                }
            }
      }
        }
    }

    @Override
    public List<Torneo> todosLosTorneos(Equipo equipo) {
        List<Torneo> resultado = new ArrayList();
        for(EquipoTorneo equi : this.equipoTorneoList){
            if(equi.getEquipo().getNombre().equals(equipo.getNombre())){
               resultado.add(equi.getTorneo());
            }
        }
        return resultado;
    }

    @Override
    public EquipoTorneo masGoleador() {
       return Collections.max(this.equipoTorneoList , new Comparator<EquipoTorneo>(){
           @Override
           public int compare(EquipoTorneo o1, EquipoTorneo o2) {
              return o1.getGolesaFavor().compareTo(o2.getGolesaFavor);
       }); 
    }
  }
    
    @Override
    public EquipoTorneo vallaMenosVencida() {
        return Collections.min(this.equipoTorneoList , new Comparator<EquipoTorneo>(){
              @Override
           public int compare(EquipoTorneo o1, EquipoTorneo o2) {
              return o1.getGolesEnContra().comareTo(o2.getGolesEnContra());
       });  
    }
    }

    @Override
    public String toString(){
        String resultado = "";
        for (EquipoTorneo equipo : this.equipoTorneoList ) 
        { resultado += equipo.toString(); }
        return resultado;
    }
    
}
